package com.google.android.chimera.container;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ModuleApi {
    protected static final void a(Method method, Object... objArr) {
        try {
            method.invoke((Object) null, objArr);
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            if (cause instanceof Exception) {
                throw ((Exception) cause);
            }
            throw new Exception(cause);
        } catch (VerifyError e2) {
            throw new Exception(e2);
        }
    }

    public Set getInstrumentationFilterRules(Context context) {
        return null;
    }

    public void onApkLoaded(Context context) {
    }

    public void onBeforeApkLoad(Context context, bms bms) {
    }
}
