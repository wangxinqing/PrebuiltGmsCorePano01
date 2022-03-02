package defpackage;

import android.content.Context;
import android.text.format.Time;
import com.google.android.gms.R;
import java.util.concurrent.TimeUnit;

/* renamed from: lsl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lsl {
    public static final long f = TimeUnit.HOURS.toMillis(6);
    public final long a;
    public final Time b;
    public final Context c;
    public final Time d = new Time();
    public final String e = this.c.getString(R.string.common_never);

    public lsl(Context context, Time time) {
        this.c = context;
        this.b = time;
        this.a = time.toMillis(false);
    }
}
