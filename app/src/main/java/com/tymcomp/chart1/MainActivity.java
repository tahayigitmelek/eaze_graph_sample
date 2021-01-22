package com.tymcomp.chart1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import org.eazegraph.lib.charts.BarChart;
import org.eazegraph.lib.charts.PieChart;
import org.eazegraph.lib.models.BarModel;
import org.eazegraph.lib.models.PieModel;

public class MainActivity extends AppCompatActivity {
    private BarChart barChart;
    private PieChart pieChart;

    @ Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        barChart = findViewById(R.id.barchart);

        barChart.addBar(new BarModel(3.f, Color.RED));
        barChart.addBar(new BarModel(2.f,  Color.BLUE));
        barChart.addBar(new BarModel(4.f, Color.YELLOW));
        barChart.addBar(new BarModel(1.f, Color.GREEN));
        barChart.addBar(new BarModel(1.3f,  Color.BLACK));
        barChart.addBar(new BarModel(0.5f, Color.GRAY));

        barChart.startAnimation();


        PieChart pieChart = findViewById(R.id.piechart);

        pieChart.addPieSlice(new PieModel("Java", 25, Color.RED));
        pieChart.addPieSlice(new PieModel("Python", 25, Color.YELLOW));
        pieChart.addPieSlice(new PieModel("C", 25, Color.BLACK));
        pieChart.addPieSlice(new PieModel("JS", 25, Color.BLUE));

        pieChart.startAnimation();



    }
}