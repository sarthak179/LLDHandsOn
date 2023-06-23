package designPatterns.prototypeAndRegistry;

public interface Prototype<T> {
    T clone();
}

/*
    public interface StudentPrototype {
        Student clone();
    }

    public interface TeacherPrototype {
        Teacher clone();
    }

    public interface NotebookPrototype {
        Notebook clone();
    }
 */
