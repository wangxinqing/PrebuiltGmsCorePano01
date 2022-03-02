package defpackage;

import android.os.AsyncTask;
import com.google.android.gms.smartdevice.setup.ui.D2DSetupChimeraActivity;
import java.lang.ref.WeakReference;

/* renamed from: aclp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aclp extends AsyncTask {
    private final WeakReference a;

    public aclp(D2DSetupChimeraActivity d2DSetupChimeraActivity) {
        this.a = new WeakReference(d2DSetupChimeraActivity);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        D2DSetupChimeraActivity d2DSetupChimeraActivity = (D2DSetupChimeraActivity) this.a.get();
        if (d2DSetupChimeraActivity != null) {
            return acph.a(d2DSetupChimeraActivity);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        D2DSetupChimeraActivity d2DSetupChimeraActivity = (D2DSetupChimeraActivity) this.a.get();
        if (d2DSetupChimeraActivity != null) {
            d2DSetupChimeraActivity.c = str;
        }
    }
}
