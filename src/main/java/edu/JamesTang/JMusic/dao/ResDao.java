package edu.JamesTang.JMusic.dao;

import edu.JamesTang.JMusic.entity.Music;

import java.util.List;

/**
 * @author JamesTang
 * @date 2020/10/9 21:30
 *
 * You need to implements this Interface to operate the database like UserDaoImplements.class.
 */
public interface ResDao {

    boolean addRes(Music music);
    boolean deleteRes(Music music);
    List<Music> getMusicList();
}
