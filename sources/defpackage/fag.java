package defpackage;

import android.content.Context;
import android.util.Log;
import android.webkit.JavascriptInterface;
import com.google.android.chimera.config.ModuleManager;

/* renamed from: fag  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fag {
    private final Context a;
    private final faf b;

    public fag(Context context, faf faf) {
        this.a = context;
        this.b = faf;
    }

    @JavascriptInterface
    public void cancel() {
        fae fae = (fae) this.b;
        fae.d = true;
        fae.c.a((amri) ampu.a);
    }

    @JavascriptInterface
    public int getModuleVersion() {
        try {
            for (ModuleManager.ModuleInfo moduleInfo : ModuleManager.get(this.a).getAllModules()) {
                if (moduleInfo.moduleId.equals("com.google.android.gms.auth.api")) {
                    return moduleInfo.moduleVersion;
                }
            }
            return 1;
        } catch (Exception e) {
            Log.e("TAG", "Failed to get the module version: %s", e);
            return 1;
        }
    }

    @JavascriptInterface
    public void setConsentResult(String str) {
        fae fae = (fae) this.b;
        if (!fae.d) {
            fae.c.a(amri.c(str));
        }
    }

    @JavascriptInterface
    public void showView() {
        ((fae) this.b).c.h.c(amri.b(true));
    }
}
