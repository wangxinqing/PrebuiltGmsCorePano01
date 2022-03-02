package defpackage;

import android.content.Intent;
import android.os.Build;
import java.util.ArrayList;

/* renamed from: abkm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abkm {
    public final ArrayList a = new ArrayList();
    public final Intent b;
    final /* synthetic */ abkn c;

    public abkm(abkn abkn) {
        this.c = abkn;
        Intent intent = new Intent("android.intent.action.INSERT_OR_EDIT");
        this.b = intent;
        intent.setType("vnd.android.cursor.item/contact");
        int i = Build.VERSION.SDK_INT;
        this.b.putExtra("finishActivityOnSaveCompleted", true);
    }
}
