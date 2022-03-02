package defpackage;

import android.content.Context;
import android.webkit.JavascriptInterface;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.config.ModuleManager;

/* renamed from: abap  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abap {
    private final Context a;
    private final abao b;

    public abap(Context context, abao abao) {
        this.a = context;
        this.b = abao;
    }

    @JavascriptInterface
    public void cancel() {
        ((aban) this.b).b.b((Object) ampu.a);
    }

    @JavascriptInterface
    public int getModuleVersion() {
        Context context = this.a;
        if (abew.b != -1) {
            return abew.b;
        }
        try {
            for (ModuleManager.ModuleInfo moduleInfo : ModuleManager.get(context).getAllModules()) {
                if (moduleInfo.moduleId.equals("com.google.android.gms.signin")) {
                    int i = moduleInfo.moduleVersion;
                    abew.b = i;
                    return i;
                }
            }
            return -1;
        } catch (Exception e) {
            abew.a.e("Failed to get the module version: %s", e, new Object[0]);
            return -1;
        }
    }

    @JavascriptInterface
    public void setConsentResult(String str) {
        ((aban) this.b).b.b((Object) amri.b(str));
    }

    @JavascriptInterface
    public void showView() {
        abao abao = this.b;
        Activity activity = ((Fragment) abao).getActivity();
        amrl.a((Object) activity);
        activity.runOnUiThread(new abaj((aban) abao));
    }
}
