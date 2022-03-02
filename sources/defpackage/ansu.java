package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/* renamed from: ansu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ansu extends LogRecord {
    private static final long serialVersionUID = 1;
    public Throwable a;
    public String b;
    public String c;
    private transient Object[] d = null;

    public ansu(Level level, String str, String str2, String str3) {
        super(level, str);
        setSourceClassName(str2);
        setSourceMethodName(str3);
    }

    private final void a() {
        StackTraceElement stackTraceElement;
        StackTraceElement[] stackTraceElementArr;
        Throwable th = this.a;
        if (th != null) {
            Class[] clsArr = {ansv.class, ansu.class};
            if (aoow.b == null) {
                stackTraceElementArr = th.getStackTrace();
            } else {
                stackTraceElementArr = null;
            }
            int i = 1;
            loop0:
            while (true) {
                if (stackTraceElementArr == null) {
                    try {
                        stackTraceElement = (StackTraceElement) aoow.b.invoke(aoow.a, new Object[]{th, Integer.valueOf(i)});
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                } else {
                    stackTraceElement = stackTraceElementArr[i];
                }
                String className = stackTraceElement.getClassName();
                if (!className.equals(aoow.class.getName())) {
                    int i2 = 0;
                    while (i2 < 2) {
                        if (!className.equals(clsArr[i2].getName())) {
                            i2++;
                        }
                    }
                    break loop0;
                }
                i++;
            }
        } else {
            stackTraceElement = aoow.a(ansv.class);
        }
        this.b = stackTraceElement.getMethodName();
        this.c = stackTraceElement.getClassName();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt != -1) {
            this.d = new Object[readInt];
            int i = 0;
            while (true) {
                Object[] objArr = this.d;
                if (i < objArr.length) {
                    objArr[i] = objectInputStream.readObject();
                    i++;
                } else {
                    return;
                }
            }
        } else {
            this.d = null;
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        Object[] objArr = this.d;
        if (objArr == null) {
            objectOutputStream.writeInt(-1);
            return;
        }
        objectOutputStream.writeInt(objArr.length);
        int i = 0;
        while (true) {
            Object[] objArr2 = this.d;
            if (i < objArr2.length) {
                Object obj = objArr2[i];
                if (obj == null) {
                    objectOutputStream.writeObject((Object) null);
                } else {
                    objectOutputStream.writeObject(obj.toString());
                }
                i++;
            } else {
                return;
            }
        }
    }

    public final String getSourceClassName() {
        if (this.c == null) {
            a();
        }
        return this.c;
    }

    public final String getSourceMethodName() {
        if (this.b == null) {
            a();
        }
        return this.b;
    }

    public final void setSourceClassName(String str) {
        this.c = str;
        super.setSourceClassName(str);
    }

    public final void setSourceMethodName(String str) {
        this.b = str;
        super.setSourceMethodName(str);
    }
}
