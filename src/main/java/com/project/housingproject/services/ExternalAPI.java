package com.project.housingproject.services;

import org.json.JSONException;

import java.io.IOException;

public interface ExternalAPI {
    String getResult(int page) throws IOException, JSONException;
}
