package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.android.chimera.ModuleContext;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.location.internal.LocationRequestInternal;
import java.util.HashMap;
import java.util.Map;

/* renamed from: rgr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rgr {
    public final Context a;
    public final Map b = new HashMap();
    public final Map c = new HashMap();
    public final Map d = new HashMap();
    public final rfk e;

    public rgr(Context context, rfk rfk) {
        this.a = context;
        this.e = rfk;
    }

    public final void a(LocationRequestInternal locationRequestInternal) {
        ModuleManager.ModuleInfo currentModule;
        if (jim.a()) {
            try {
                if (locationRequestInternal.h == null && ModuleContext.getModuleContext(this.a) != null && (currentModule = ModuleManager.get(this.a).getCurrentModule()) != null) {
                    locationRequestInternal.h = currentModule.moduleId;
                }
            } catch (IllegalStateException e2) {
                Log.e("LocationClientHelper", "exception when setting module id", e2);
            }
        }
    }
}
