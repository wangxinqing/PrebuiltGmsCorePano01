package defpackage;

import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import java.util.UUID;

/* renamed from: fzm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fzm {
    public static Intent a(PendingIntent pendingIntent) {
        iva.a((Object) pendingIntent, (Object) "The target cannot be null!");
        Intent intent = new Intent("com.google.android.gms.ui.UNPACKING_REDIRECT").setPackage("com.google.android.gms");
        String valueOf = String.valueOf(UUID.randomUUID());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 52);
        sb.append("intent://com.google.android.gms.auth.uiflows.common/");
        sb.append(valueOf);
        return intent.setData(Uri.parse(sb.toString())).putExtra("target", pendingIntent);
    }
}
