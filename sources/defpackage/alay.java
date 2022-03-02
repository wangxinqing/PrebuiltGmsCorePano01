package defpackage;

import android.util.Log;
import com.google.android.places.ui.aliaseditor.AliasEditorChimeraActivity;

/* renamed from: alay  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alay implements Runnable {
    final /* synthetic */ AliasEditorChimeraActivity a;

    public alay(AliasEditorChimeraActivity aliasEditorChimeraActivity) {
        this.a = aliasEditorChimeraActivity;
    }

    public final void run() {
        this.a.k();
        if (Log.isLoggable("Places", 5)) {
            Log.w("Places", "Failed to find aliased places");
        }
    }
}
