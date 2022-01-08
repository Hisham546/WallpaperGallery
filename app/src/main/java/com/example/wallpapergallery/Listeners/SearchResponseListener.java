package com.example.wallpapergallery.Listeners;

import com.example.wallpapergallery.Models.SearchApiResponse;

public interface SearchResponseListener {

    void onFetch(SearchApiResponse response, String message);

    void onError(String message);
}
