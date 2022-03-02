package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.FragmentManagerState;
import android.support.v4.app.FragmentState;
import java.util.List;

/* renamed from: jt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jt {
    /* JADX WARNING: type inference failed for: r6v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.List a(java.lang.Object r6, java.lang.Class r7) {
        /*
            r0 = 0
            if (r6 == 0) goto L_0x002b
            int r1 = r6.size()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3 = 0
        L_0x000d:
            if (r3 >= r1) goto L_0x002a
            java.lang.Object r4 = r6.get(r3)
            if (r4 != 0) goto L_0x0019
            r2.add(r0)
            goto L_0x0027
        L_0x0019:
            java.lang.Class r5 = r4.getClass()
            boolean r5 = r7.isAssignableFrom(r5)
            defpackage.amrl.a((boolean) r5)
            r2.add(r4)
        L_0x0027:
            int r3 = r3 + 1
            goto L_0x000d
        L_0x002a:
            return r2
        L_0x002b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jt.a(java.lang.Object, java.lang.Class):java.util.List");
    }

    public static void a(Bundle bundle, hl hlVar) {
        Bundle bundle2;
        Bundle bundle3 = null;
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj instanceof FragmentManagerState) {
                FragmentManagerState fragmentManagerState = (FragmentManagerState) obj;
                if (hlVar != null) {
                    List d = hlVar.a.d();
                    List a = a((Object) fragmentManagerState.a, FragmentState.class);
                    if (a != null) {
                        for (int i = 0; i < d.size(); i++) {
                            gj gjVar = (gj) d.get(i);
                            if (gjVar == null) {
                                amtf.a(a.get(i) == null);
                            } else {
                                FragmentState fragmentState = (FragmentState) a.get(i);
                                if (fragmentState != null) {
                                    bundle2 = fragmentState.m;
                                } else {
                                    bundle2 = null;
                                }
                                if (bundle2 != null) {
                                    a(bundle2, gjVar.getChildFragmentManager());
                                }
                            }
                        }
                    }
                }
                if (bundle3 == null) {
                    bundle3 = new Bundle();
                }
                bundle3.putParcelable(str, (Parcelable) obj);
                bundle.putParcelable(str, (Parcelable) null);
            }
        }
        if (bundle3 == null) {
            bundle.remove("_chimera_container_frag_state");
        } else {
            bundle.putBundle("_chimera_container_frag_state", bundle3);
        }
    }

    public static void a(Bundle bundle, ClassLoader classLoader, ClassLoader classLoader2) {
        List a;
        Bundle bundle2 = bundle.getBundle("_chimera_top_level_wrapper_state");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
            bundle.remove("_chimera_top_level_wrapper_state");
        }
        Bundle bundle3 = bundle.getBundle("_chimera_container_frag_state");
        if (bundle3 != null) {
            bundle3.setClassLoader(classLoader2);
            bundle.remove("_chimera_container_frag_state");
        }
        if (bundle2 != null) {
            for (String str : bundle2.keySet()) {
                Object obj = bundle2.get(str);
                if (obj != null) {
                    bundle.putParcelable(str, (Parcelable) obj);
                }
            }
        }
        if (bundle3 != null) {
            for (String str2 : bundle3.keySet()) {
                Object obj2 = bundle3.get(str2);
                if (obj2 != null) {
                    bundle.putParcelable(str2, (Parcelable) obj2);
                    if ((obj2 instanceof FragmentManagerState) && (a = a((Object) ((FragmentManagerState) obj2).a, FragmentState.class)) != null) {
                        for (int i = 0; i < a.size(); i++) {
                            FragmentState fragmentState = (FragmentState) a.get(i);
                            if (fragmentState != null) {
                                Bundle bundle4 = fragmentState.m;
                                if (bundle4 != null) {
                                    bundle4.setClassLoader(classLoader);
                                    a(bundle4, classLoader, classLoader2);
                                }
                                Bundle bundle5 = fragmentState.j;
                                if (bundle5 != null) {
                                    bundle5.setClassLoader(classLoader);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
