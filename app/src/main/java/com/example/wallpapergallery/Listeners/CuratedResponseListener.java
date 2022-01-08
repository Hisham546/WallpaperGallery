package com.example.wallpapergallery.Listeners;

import com.example.wallpapergallery.Models.CuratedApiResponse;

public interface CuratedResponseListener {

    void onFetch(CuratedApiResponse response, String message);

    void onError(String message);
}
