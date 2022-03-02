package defpackage;

import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: awcp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class awcp extends ThreadLocal {
    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object initialValue() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
        simpleDateFormat.setLenient(false);
        simpleDateFormat.setTimeZone(awcq.a);
        return simpleDateFormat;
    }
}
