package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.regex.Pattern;

/* renamed from: aasg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aasg {
    public static final String[] a = {"/system/xbin", "/system/bin", "/system/sd/xbin", "/system/bin/failsafe", "/data/local", "/system", "/system/bin/.ext", "/data/local/xbin", "/data/local/bin"};
    public final Object b;
    public final Method c;
    public final Field d;
    public final Field e;
    public final int f;
    public final boolean g;
    public int h = 0;
    public final Pattern i = Pattern.compile(".*avc: denied \\{ getattr \\}.*for path=\"(.*)\" dev=.*su_exec.*");

    public aasg() {
        String str;
        Field field;
        Object obj;
        Field field2;
        Method method;
        int i2 = 0;
        try {
            Class.forName("libcore.io.StructStat");
            str = "libcore.io";
        } catch (ClassNotFoundException e2) {
            str = "android.system";
        }
        boolean z = true;
        Object obj2 = null;
        try {
            Class<?> cls = Class.forName(str.concat(".StructStat"));
            Class<?> cls2 = Class.forName(str.concat(".OsConstants"));
            Class<?> cls3 = Class.forName(str.concat(".Os"));
            obj = Class.forName("libcore.io.Libcore").getField("os").get((Object) null);
            try {
                method = cls3.getMethod("lstat", new Class[]{String.class});
                try {
                    field = cls.getField("st_mode");
                } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchFieldException | NoSuchMethodException e3) {
                    field2 = null;
                    field = field2;
                    obj2 = obj;
                    obj = obj2;
                    z = false;
                    this.b = obj;
                    this.c = method;
                    this.d = field;
                    this.e = field2;
                    this.f = i2;
                    this.g = z;
                }
                try {
                    field2 = cls.getField("st_uid");
                } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchFieldException | NoSuchMethodException e4) {
                    field2 = null;
                    obj2 = obj;
                    obj = obj2;
                    z = false;
                    this.b = obj;
                    this.c = method;
                    this.d = field;
                    this.e = field2;
                    this.f = i2;
                    this.g = z;
                }
                try {
                    i2 = cls2.getField("S_ISUID").getInt((Object) null);
                } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchFieldException | NoSuchMethodException e5) {
                    obj2 = obj;
                    obj = obj2;
                    z = false;
                    this.b = obj;
                    this.c = method;
                    this.d = field;
                    this.e = field2;
                    this.f = i2;
                    this.g = z;
                }
            } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchFieldException | NoSuchMethodException e6) {
                method = null;
                field2 = null;
                field = field2;
                obj2 = obj;
                obj = obj2;
                z = false;
                this.b = obj;
                this.c = method;
                this.d = field;
                this.e = field2;
                this.f = i2;
                this.g = z;
            }
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchFieldException | NoSuchMethodException e7) {
            method = null;
            field2 = null;
            field = null;
            obj = obj2;
            z = false;
            this.b = obj;
            this.c = method;
            this.d = field;
            this.e = field2;
            this.f = i2;
            this.g = z;
        }
        this.b = obj;
        this.c = method;
        this.d = field;
        this.e = field2;
        this.f = i2;
        this.g = z;
    }
}
