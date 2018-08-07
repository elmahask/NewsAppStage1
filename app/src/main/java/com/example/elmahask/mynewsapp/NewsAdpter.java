package com.example.elmahask.mynewsapp;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class NewsAdpter extends ArrayAdapter<News> {

    /**
     * Constructs a new {@link NewsAdpter}.
     */
    public NewsAdpter(Context context, List<News> earthquakes) {
        super(context, 0, earthquakes);
    }

    public static String formatDate(String date) {
        String jsonDate = "yyyy-MM-dd'T'HH:mm:ss'Z'";
        SimpleDateFormat jsonDateFormatter = new SimpleDateFormat(jsonDate, Locale.US);
        try {
            Date dateParsedJson = jsonDateFormatter.parse(date);
            String finalDate = "dd MMM yyyy";
            SimpleDateFormat finalDateFormatter = new SimpleDateFormat(finalDate, Locale.US);
            return finalDateFormatter.format(dateParsedJson);
        } catch (ParseException e) {
            Log.e("QueryUtils", "Error parsing JSON date: ", e);
            return "";
        }
    }

    /**
     * Returns a list item view that displays information in the list of news.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (convertView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.news_list_item, parent, false);
        }

        News currentNews = getItem(position);

        TextView newsTitle = listItemView.findViewById(R.id.title);
        newsTitle.setText(currentNews.getmTitle());

        TextView newsSection = listItemView.findViewById(R.id.section);
        newsSection.setText(currentNews.getmSection());

        TextView newPillarName = listItemView.findViewById(R.id.category);
        newPillarName.setText(currentNews.getmPillarName());

        TextView newsDate = listItemView.findViewById(R.id.date);
        newsDate.setText(formatDate(currentNews.getmDate()));
//        newsDate.setText(currentNews.getmDate());

        return listItemView;
    }
}
