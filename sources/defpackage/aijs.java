package defpackage;

import android.location.Location;
import java.io.PrintWriter;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/* renamed from: aijs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface aijs {
    public static final Comparator a = new aijo();
    public static final Comparator b = new aijp();

    aijq a(Iterable iterable, int i, long j, Location location, double d, Map map);

    List a(Iterable iterable);

    List a(Iterable iterable, double d, int i);

    void a(PrintWriter printWriter);

    void a(Iterable iterable, int i);

    List b(Iterable iterable, int i);

    List c(Iterable iterable, int i);
}
