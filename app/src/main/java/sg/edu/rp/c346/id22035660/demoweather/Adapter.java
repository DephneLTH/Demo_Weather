package sg.edu.rp.c346.id22035660.demoweather;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class Adapter extends ArrayAdapter<Weather> {

    private Context Context1;
    private ArrayList<Weather> WeatherList1;
    public Adapter(Context context, ArrayList<Weather> weatherList) {
        super(context, 0, weatherList);

        Context1 = context;
        WeatherList1 = weatherList;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItem = convertView;
        if (listItem == null) {
            listItem = LayoutInflater.from(Context1).inflate(R.layout.row, parent, false);
        }

        Weather currentWeather = WeatherList1.get(position);
        TextView areaTextView = listItem.findViewById(R.id.tvArea);
        areaTextView.setText(currentWeather.getArea());
        TextView forecastTextView = listItem.findViewById(R.id.tvForecast);
        forecastTextView.setText(currentWeather.getForecast());
        return listItem;
    }
}

