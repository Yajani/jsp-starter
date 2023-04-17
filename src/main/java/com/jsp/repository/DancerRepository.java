package com.jsp.repository;

import java.util.HashMap;

//댄서 정보 저장소
public class DancerRepository {
    private final Map<String, Dancer> dancerMap = new HashMap<>();

    //댄서 저장 기능
    public void save(String name, String creName, String dancerlevel, String[] genres){
        // Dancer 객체로 포장
        Dancer dancer = new Dancer();
        dancer.setName(name);
        dancer.setCrewName(crewName);
        dancer.setDanceLevel(Dancer.DanceLevel.valueOf(danceLevel));

        List<Dancer.Genre> genres = new ArrayList<>();
        if (genresArray != null) {
            for (String g : genresArray) {
                genres.add(Dancer.Genre.valueOf(g));
            }
        }
        dancer.setGenres(genres);

        System.out.println("dancer = " + dancer);


        // dancerList에 저장
        dancerMap.put(name, dancer);
    }

}
