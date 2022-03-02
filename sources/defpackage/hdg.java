package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.chimera.ModuleContext;
import com.google.android.chimera.util.ChimeraResource;

/* renamed from: hdg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hdg {
    public static int a(Context context, int i) {
        ModuleContext moduleContext = ModuleContext.getModuleContext(context);
        if (moduleContext == null) {
            return i;
        }
        Resources containerResources = moduleContext.getContainerResources();
        Resources resources = context.getResources();
        ClassLoader classLoader = moduleContext.getContainerContext().getClass().getClassLoader();
        amtf.a((Object) classLoader);
        return ChimeraResource.getResourceId(classLoader, containerResources, resources, i);
    }
}
