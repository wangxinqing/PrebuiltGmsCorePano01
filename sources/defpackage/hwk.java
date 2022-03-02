package defpackage;

import android.content.Context;
import com.google.android.gms.net.GmsCoreCronetProvider;
import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: hwk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class hwk implements hwj {
    private final Context a;

    public hwk(Context context) {
        this.a = context;
    }

    public final HttpURLConnection a(String str) {
        return (HttpURLConnection) new GmsCoreCronetProvider(this.a).createBuilder().build().openConnection(new URL(str));
    }
}
