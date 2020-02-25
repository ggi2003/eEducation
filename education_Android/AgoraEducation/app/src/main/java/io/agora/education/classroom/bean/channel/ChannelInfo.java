package io.agora.education.classroom.bean.channel;

import java.util.ArrayList;
import java.util.List;

import io.agora.education.classroom.bean.JsonBean;
import io.agora.education.classroom.bean.user.Student;
import io.agora.education.classroom.bean.user.Teacher;
import io.agora.education.service.bean.response.AppConfig;

public class ChannelInfo extends JsonBean {

    public static int SHARE_UID = 7;
    public static AppConfig CONFIG;

    public volatile Student local;
    public volatile Teacher teacher;
    public volatile List<Student> students;

    public ChannelInfo(Student local) {
        this.local = local;
        this.students = new ArrayList<>();
    }

}
