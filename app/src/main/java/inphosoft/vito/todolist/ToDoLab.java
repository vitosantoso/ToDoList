package inphosoft.vito.todolist;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ToDoLab {

    private static ToDoLab sToDoLab;

    private List<ToDo> mToDo;

    public static ToDoLab get(Context context) {
        if (sToDoLab == null) {
            sToDoLab = new ToDoLab(context);
        }
        return sToDoLab;
    }

    private ToDoLab(Context context) {
        mToDo = new ArrayList<>();
    }

    public void addCrime(ToDo c) {
        mToDo.add(c);
    }

    public List<ToDo> getCrimes() {
        return mToDo;
    }

    public ToDo getCrime(UUID id) {
        for (ToDo toDo : mToDo) {
            if (toDo.getID().equals(id)) {
                return toDo;
            }
        }

        return null;
    }
}
