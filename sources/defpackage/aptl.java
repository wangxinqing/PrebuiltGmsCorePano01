package defpackage;

import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.common.api.Status;
import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: aptl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface aptl {
    public static final iwd a = new iwd("FirebaseAuth", "GetAuthDomainTaskResponseHandler");

    Uri.Builder a(Intent intent, String str, String str2);

    String a();

    HttpURLConnection a(URL url);

    void a(Uri uri, String str);

    void a(String str, Status status);
}
