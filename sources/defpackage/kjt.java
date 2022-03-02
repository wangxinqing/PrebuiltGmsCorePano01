package defpackage;

import java.util.GregorianCalendar;
import java.util.TimeZone;

/* renamed from: kjt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class kjt extends ThreadLocal {
    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object initialValue() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTimeZone(TimeZone.getTimeZone("GMT"));
        gregorianCalendar.clear();
        return gregorianCalendar;
    }
}
