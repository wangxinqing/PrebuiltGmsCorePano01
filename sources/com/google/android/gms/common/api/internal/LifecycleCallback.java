package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.Fragment;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class LifecycleCallback {
    public final ify e;

    protected LifecycleCallback(ify ify) {
        this.e = ify;
    }

    public static ify a(Activity activity) {
        return a(new ifx(activity));
    }

    private static ify getChimeraLifecycleFragmentImpl(ifx ifx) {
        idt idt;
        com.google.android.chimera.Activity activity = (com.google.android.chimera.Activity) ifx.a;
        WeakReference weakReference = (WeakReference) idt.a.get(activity);
        if (weakReference == null || (idt = (idt) weakReference.get()) == null) {
            try {
                idt = (idt) activity.getFragmentManager().findFragmentByTag("ChimeraLifecycleFragmentImpl");
                if (idt == null || idt.isRemoving()) {
                    idt = new idt();
                    activity.getFragmentManager().beginTransaction().add((Fragment) idt, "ChimeraLifecycleFragmentImpl").commitAllowingStateLoss();
                }
                idt.a.put(activity, new WeakReference(idt));
            } catch (ClassCastException e2) {
                throw new IllegalStateException("Fragment with tag ChimeraLifecycleFragmentImpl is not a ChimeraLifecycleFragmentImpl", e2);
            }
        }
        return idt;
    }

    public void a() {
    }

    public void a(int i, int i2, Intent intent) {
    }

    public void a(Bundle bundle) {
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public void b() {
    }

    public void b(Bundle bundle) {
    }

    public void e() {
    }

    public final Activity f() {
        return this.e.a();
    }

    public static ify a(com.google.android.chimera.Activity activity) {
        return a(new ifx(activity));
    }

    public static ify a(ifx ifx) {
        igx igx;
        iga iga;
        Object obj = ifx.a;
        if (obj instanceof gl) {
            gl glVar = (gl) obj;
            WeakReference weakReference = (WeakReference) igx.a.get(glVar);
            if (weakReference == null || (igx = (igx) weakReference.get()) == null) {
                try {
                    igx = (igx) glVar.at().a("SupportLifecycleFragmentImpl");
                    if (igx == null || igx.isRemoving()) {
                        igx = new igx();
                        ht a = glVar.at().a();
                        a.a((gj) igx, "SupportLifecycleFragmentImpl");
                        a.g();
                    }
                    igx.a.put(glVar, new WeakReference(igx));
                } catch (ClassCastException e2) {
                    throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e2);
                }
            }
            return igx;
        } else if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            WeakReference weakReference2 = (WeakReference) iga.a.get(activity);
            if (weakReference2 == null || (iga = (iga) weakReference2.get()) == null) {
                try {
                    iga = (iga) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
                    if (iga == null || iga.isRemoving()) {
                        iga = new iga();
                        activity.getFragmentManager().beginTransaction().add(iga, "LifecycleFragmentImpl").commitAllowingStateLoss();
                    }
                    iga.a.put(activity, new WeakReference(iga));
                } catch (ClassCastException e3) {
                    throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e3);
                }
            }
            return iga;
        } else if (obj instanceof com.google.android.chimera.Activity) {
            return getChimeraLifecycleFragmentImpl(ifx);
        } else {
            throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
        }
    }
}
