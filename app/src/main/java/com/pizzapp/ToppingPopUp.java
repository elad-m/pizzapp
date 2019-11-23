package com.pizzapp;

import android.app.Activity;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import com.pizzapp.model.Database;
import com.pizzapp.model.pizza.Slice;
import com.pizzapp.model.pizza.Topping;
import com.pizzapp.utilities.IO;

import org.json.JSONException;

import java.io.IOException;
import java.util.List;

import static android.widget.GridLayout.spec;

public class ToppingPopUp extends AppCompatActivity {

    int BOX_WIDTH = 120;
    int BOX_HEIGHT = 52;
    private GridLayout gridLayout;
    private List<Topping> toppingsList = IO.getDatabaseFromInputStream(getResources().openRawResource(R.raw.database)).getToppings();

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.toppings_popup);
//        GridLayout layout = (GridLayout) findViewById(R.id.grid_layout);
//        layout.setRowCount(4);
//        int numberOfColumns = calculateNumberOfColumns();
//        layout.setColumnCount(numberOfColumns);
//        for (int i = 0; i < 4; i++) {
//            GridLayout.Spec rowSpec = GridLayout.spec(i, 1, 1);
//            for (int j = 0; j < numberOfColumns; j++) {
//                GridLayout.Spec colSpec = spec(j, 1, 1);
//                final CheckBox checkBox = new CheckBox(this);
//                checkBox.setLayoutParams(new ViewGroup.LayoutParams(0, 0));
//                checkBox.setId(4 * j + i);
//                checkBox.setText(toppingsList.get(4 * j + i).getName());
//                checkBox.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        if (checkBox.isChecked()){
//                            // TODO: 18 נובמבר 2019 add item picture and add to object
//                        }
//                        else {
//                            // TODO: 18 נובמבר 2019 delete from picture
//                        }
//                    }
//                });
//                GridLayout.LayoutParams myGLP = new GridLayout.LayoutParams();
//                myGLP.rowSpec = rowSpec;
//                myGLP.columnSpec = colSpec;
//                layout.addView(checkBox, myGLP);
//            }
//        }
//    }
//
//
//    private int calculateNumberOfColumns() {
//        int numberOfRows = toppingsList.size() / 4;
//        if (toppingsList.size() % 4 != 0){
//            numberOfRows++;
//        }
//        return numberOfRows;
    }

}