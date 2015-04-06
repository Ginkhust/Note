package com.diary.client.mapper;

import com.diary.client.place.DiaryPlace;
import com.diary.client.place.LoginPlace;
import com.diary.client.place.RegistrationPlace;
import com.google.gwt.place.shared.PlaceHistoryMapper;
import com.google.gwt.place.shared.WithTokenizers;

@WithTokenizers({DiaryPlace.Tokenizer.class, LoginPlace.Tokenizer.class, RegistrationPlace.Tokenizer.class})
public interface DiaryPlaceHistoryMapper extends PlaceHistoryMapper {

}
