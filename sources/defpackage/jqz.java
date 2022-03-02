package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;

/* renamed from: jqz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jqz {
    static amri a(String str, String str2) {
        return (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) ? ampu.a : amri.b(new Intent(str).setData(Uri.parse(str2)));
    }
}
