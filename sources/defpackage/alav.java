package defpackage;

import android.util.Log;
import com.google.android.places.ui.aliaseditor.AliasEditorChimeraActivity;
import java.util.Iterator;
import java.util.Map;

/* renamed from: alav  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alav implements Runnable {
    final /* synthetic */ Map a;
    final /* synthetic */ AliasEditorChimeraActivity b;

    public alav(AliasEditorChimeraActivity aliasEditorChimeraActivity, Map map) {
        this.b = aliasEditorChimeraActivity;
        this.a = map;
    }

    public final void run() {
        rhq rhq;
        this.b.k();
        Iterator it = this.a.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                rhq = null;
                break;
            }
            String str = (String) it.next();
            if (this.b.b.equals(str)) {
                rhq = (rhq) this.a.get(str);
                break;
            }
        }
        if (rhq != null) {
            AliasEditorChimeraActivity aliasEditorChimeraActivity = this.b;
            aliasEditorChimeraActivity.g = rhq;
            aliasEditorChimeraActivity.b(aliasEditorChimeraActivity.g);
            AliasEditorChimeraActivity aliasEditorChimeraActivity2 = this.b;
            if (aliasEditorChimeraActivity2.h != null) {
                aliasEditorChimeraActivity2.h = null;
                this.b.l();
                return;
            }
            return;
        }
        if (Log.isLoggable("Places", 5)) {
            String valueOf = String.valueOf(this.b.b);
            Log.w("Places", valueOf.length() == 0 ? new String("Failed to find place for alias ") : "Failed to find place for alias ".concat(valueOf));
        }
        AliasEditorChimeraActivity aliasEditorChimeraActivity3 = this.b;
        rhq rhq2 = aliasEditorChimeraActivity3.h;
        if (rhq2 != null) {
            aliasEditorChimeraActivity3.a(rhq2.a(), this.b.h.q().toString());
        }
    }
}
