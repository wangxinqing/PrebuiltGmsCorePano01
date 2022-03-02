package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel;
import com.google.android.gms.measurement.internal.EventParams;
import com.google.android.gms.measurement.internal.EventParcel;
import com.google.android.gms.measurement.internal.UserAttributeParcel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: sxd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class sxd extends sot {
    protected sxc b;
    public final AtomicReference c = new AtomicReference();
    private final Set d = new CopyOnWriteArraySet();
    private boolean e;

    public sxd(svv svv) {
        super(svv);
    }

    public final ArrayList a(String str, String str2, String str3) {
        if (F().c()) {
            E().c.a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        u();
        if (spc.a()) {
            E().c.a("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        this.x.F().a(atomicReference, "get conditional user properties", new swz(this, atomicReference, str, str2, str3));
        List<ConditionalUserPropertyParcel> list = (List) atomicReference.get();
        if (list == null) {
            E().c.a("Timed out waiting for get conditional user properties", str);
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (ConditionalUserPropertyParcel conditionalUserPropertyParcel : list) {
            Bundle bundle = new Bundle();
            bundle.putString("app_id", conditionalUserPropertyParcel.a);
            bundle.putString("origin", conditionalUserPropertyParcel.b);
            bundle.putLong("creation_timestamp", conditionalUserPropertyParcel.d);
            bundle.putString("name", conditionalUserPropertyParcel.c.b);
            swo.a(bundle, conditionalUserPropertyParcel.c.a());
            bundle.putBoolean("active", conditionalUserPropertyParcel.e);
            String str4 = conditionalUserPropertyParcel.f;
            if (str4 != null) {
                bundle.putString("trigger_event_name", str4);
            }
            EventParcel eventParcel = conditionalUserPropertyParcel.g;
            if (eventParcel != null) {
                bundle.putString("timed_out_event_name", eventParcel.a);
                EventParams eventParams = conditionalUserPropertyParcel.g.b;
                if (eventParams != null) {
                    bundle.putBundle("timed_out_event_params", eventParams.a());
                }
            }
            bundle.putLong("trigger_timeout", conditionalUserPropertyParcel.h);
            EventParcel eventParcel2 = conditionalUserPropertyParcel.i;
            if (eventParcel2 != null) {
                bundle.putString("triggered_event_name", eventParcel2.a);
                EventParams eventParams2 = conditionalUserPropertyParcel.i.b;
                if (eventParams2 != null) {
                    bundle.putBundle("triggered_event_params", eventParams2.a());
                }
            }
            bundle.putLong("triggered_timestamp", conditionalUserPropertyParcel.c.c);
            bundle.putLong("time_to_live", conditionalUserPropertyParcel.j);
            EventParcel eventParcel3 = conditionalUserPropertyParcel.k;
            if (eventParcel3 != null) {
                bundle.putString("expired_event_name", eventParcel3.a);
                EventParams eventParams3 = conditionalUserPropertyParcel.k.b;
                if (eventParams3 != null) {
                    bundle.putBundle("expired_event_params", eventParams3.a());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public final void b(String str, String str2, long j, Bundle bundle, String str3) {
        Bundle bundle2 = new Bundle(bundle);
        for (String str4 : bundle2.keySet()) {
            Object obj = bundle2.get(str4);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str4, new Bundle((Bundle) obj));
            } else {
                int i = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i < parcelableArr.length) {
                        Parcelable parcelable = parcelableArr[i];
                        if (parcelable instanceof Bundle) {
                            parcelableArr[i] = new Bundle((Bundle) parcelable);
                        }
                        i++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i < list.size()) {
                        Object obj2 = list.get(i);
                        if (obj2 instanceof Bundle) {
                            list.set(i, new Bundle((Bundle) obj2));
                        }
                        i++;
                    }
                }
            }
        }
        F().a((Runnable) new swv(this, str, str2, j, bundle2, str3));
    }

    /* access modifiers changed from: protected */
    public final boolean n() {
        return false;
    }

    public final Map a(String str, String str2, String str3, boolean z) {
        if (F().c()) {
            E().c.a("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        }
        u();
        if (spc.a()) {
            E().c.a("Cannot get user properties from main thread");
            return Collections.emptyMap();
        }
        AtomicReference atomicReference = new AtomicReference();
        this.x.F().a(atomicReference, "get user properties", new sxa(this, atomicReference, str, str2, str3, z));
        List<UserAttributeParcel> list = (List) atomicReference.get();
        if (list == null) {
            E().c.a("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z));
            return Collections.emptyMap();
        }
        nz nzVar = new nz(list.size());
        for (UserAttributeParcel userAttributeParcel : list) {
            nzVar.put(userAttributeParcel.b, userAttributeParcel.a());
        }
        return nzVar;
    }

    public final void a(Bundle bundle, long j) {
        iva.a((Object) bundle);
        swo.a(bundle, "app_id", String.class, (Object) null);
        swo.a(bundle, "origin", String.class, (Object) null);
        swo.a(bundle, "name", String.class, (Object) null);
        swo.a(bundle, "value", Object.class, (Object) null);
        swo.a(bundle, "trigger_event_name", String.class, (Object) null);
        swo.a(bundle, "trigger_timeout", Long.class, 0L);
        swo.a(bundle, "timed_out_event_name", String.class, (Object) null);
        swo.a(bundle, "timed_out_event_params", Bundle.class, (Object) null);
        swo.a(bundle, "triggered_event_name", String.class, (Object) null);
        swo.a(bundle, "triggered_event_params", Bundle.class, (Object) null);
        swo.a(bundle, "time_to_live", Long.class, 0L);
        swo.a(bundle, "expired_event_name", String.class, (Object) null);
        swo.a(bundle, "expired_event_params", Bundle.class, (Object) null);
        iva.c(bundle.getString("name"));
        iva.c(bundle.getString("origin"));
        iva.a(bundle.get("value"));
        bundle.putLong("creation_timestamp", j);
        String string = bundle.getString("name");
        Object obj = bundle.get("value");
        if (x().c(string) != 0) {
            E().c.a("Invalid conditional user property name", y().c(string));
        } else if (x().b(string, obj) != 0) {
            E().c.a("Invalid conditional user property value", y().c(string), obj);
        } else {
            Object c2 = x().c(string, obj);
            if (c2 == null) {
                E().c.a("Unable to normalize conditional user property value", y().c(string), obj);
                return;
            }
            swo.a(bundle, c2);
            long j2 = bundle.getLong("trigger_timeout");
            if (!TextUtils.isEmpty(bundle.getString("trigger_event_name"))) {
                v();
                if (j2 > 15552000000L || j2 < 1) {
                    E().c.a("Invalid conditional user property timeout", y().c(string), Long.valueOf(j2));
                    return;
                }
            }
            long j3 = bundle.getLong("time_to_live");
            v();
            if (j3 <= 15552000000L && j3 >= 1) {
                F().a((Runnable) new swx(this, bundle));
            } else {
                E().c.a("Invalid conditional user property time to live", y().c(string), Long.valueOf(j3));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(String str) {
        this.c.set(str);
    }

    /* access modifiers changed from: package-private */
    public final void a(String str, String str2, long j, Bundle bundle) {
        i();
        h();
        a(str, str2, j, bundle, (String) null);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x0548  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x0563 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r28, java.lang.String r29, long r30, android.os.Bundle r32, java.lang.String r33) {
        /*
            r27 = this;
            r7 = r27
            r8 = r28
            r9 = r29
            r10 = r30
            r12 = r32
            defpackage.iva.c(r28)
            defpackage.iva.a((java.lang.Object) r32)
            r27.h()
            r27.l()
            svv r0 = r7.x
            boolean r0 = r0.q()
            if (r0 != 0) goto L_0x002a
            sut r0 = r27.E()
            sur r0 = r0.j
            java.lang.String r1 = "Event not sent since app measurement is disabled"
            r0.a(r1)
            return
        L_0x002a:
            spg r0 = r27.v()
            suc r1 = defpackage.sud.ac
            boolean r0 = r0.a((defpackage.suc) r1)
            if (r0 == 0) goto L_0x0051
            suh r0 = r27.e()
            java.util.List r0 = r0.h
            if (r0 != 0) goto L_0x003f
            goto L_0x0051
        L_0x003f:
            boolean r0 = r0.contains(r9)
            if (r0 != 0) goto L_0x0051
            sut r0 = r27.E()
            sur r0 = r0.j
            java.lang.String r1 = "Dropping non-safelisted event. event name, origin"
            r0.a(r1, r9, r8)
            return
        L_0x0051:
            boolean r0 = r7.e
            r13 = 0
            r14 = 0
            r15 = 1
            if (r0 == 0) goto L_0x0059
            goto L_0x00a7
        L_0x0059:
            r7.e = r15
            svv r0 = r7.x     // Catch:{ ClassNotFoundException -> 0x009b }
            boolean r0 = r0.e     // Catch:{ ClassNotFoundException -> 0x009b }
            if (r0 == 0) goto L_0x0068
            java.lang.String r0 = "com.google.android.gms.tagmanager.TagManagerService"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x009b }
            goto L_0x0076
        L_0x0068:
            java.lang.String r0 = "com.google.android.gms.tagmanager.TagManagerService"
            android.content.Context r1 = r27.z()     // Catch:{ ClassNotFoundException -> 0x009b }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x009b }
            java.lang.Class r0 = java.lang.Class.forName(r0, r15, r1)     // Catch:{ ClassNotFoundException -> 0x009b }
        L_0x0076:
            java.lang.Class[] r1 = new java.lang.Class[r15]     // Catch:{ Exception -> 0x008e }
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r1[r14] = r2     // Catch:{ Exception -> 0x008e }
            java.lang.String r2 = "initialize"
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r2, r1)     // Catch:{ Exception -> 0x008e }
            java.lang.Object[] r1 = new java.lang.Object[r15]     // Catch:{ Exception -> 0x008e }
            android.content.Context r2 = r27.z()     // Catch:{ Exception -> 0x008e }
            r1[r14] = r2     // Catch:{ Exception -> 0x008e }
            r0.invoke(r13, r1)     // Catch:{ Exception -> 0x008e }
            goto L_0x00a7
        L_0x008e:
            r0 = move-exception
            sut r1 = r27.E()     // Catch:{ ClassNotFoundException -> 0x009b }
            sur r1 = r1.f     // Catch:{ ClassNotFoundException -> 0x009b }
            java.lang.String r2 = "Failed to invoke Tag Manager's initialize() method"
            r1.a(r2, r0)     // Catch:{ ClassNotFoundException -> 0x009b }
            goto L_0x00a7
        L_0x009b:
            r0 = move-exception
            sut r0 = r27.E()
            sur r0 = r0.i
            java.lang.String r1 = "Tag Manager is not found and thus will not be used"
            r0.a(r1)
        L_0x00a7:
            spg r0 = r27.v()
            suc r1 = defpackage.sud.ap
            boolean r0 = r0.a((defpackage.suc) r1)
            if (r0 == 0) goto L_0x00da
            java.lang.String r0 = "_cmp"
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x00da
            java.lang.String r0 = "gclid"
            boolean r0 = r12.containsKey(r0)
            if (r0 == 0) goto L_0x00da
            java.lang.String r0 = "gclid"
            java.lang.String r4 = r12.getString(r0)
            jiq r0 = r27.A()
            long r5 = r0.a()
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_lgclid"
            r1 = r27
            r1.a((java.lang.String) r2, (java.lang.String) r3, (java.lang.Object) r4, (long) r5)
        L_0x00da:
            spc r0 = r27.u()
            boolean r0 = r0.a
            if (r0 == 0) goto L_0x0103
            sxn r1 = r27.c()
            monitor-enter(r1)
            sxk r0 = r1.f     // Catch:{ all -> 0x0100 }
            if (r0 == 0) goto L_0x00fb
            java.lang.String r0 = r1.g     // Catch:{ all -> 0x0100 }
            if (r0 == 0) goto L_0x00fb
            r6 = r33
            boolean r0 = r0.equals(r6)     // Catch:{ all -> 0x0100 }
            if (r0 == 0) goto L_0x00fd
            sxk r0 = r1.f     // Catch:{ all -> 0x0100 }
            monitor-exit(r1)     // Catch:{ all -> 0x0100 }
            goto L_0x0119
        L_0x00fb:
            r6 = r33
        L_0x00fd:
            monitor-exit(r1)     // Catch:{ all -> 0x0100 }
            r0 = r13
            goto L_0x0119
        L_0x0100:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0100 }
            throw r0
        L_0x0103:
            r6 = r33
            sxn r0 = r27.c()
            sxk r0 = r0.o()
            if (r0 == 0) goto L_0x0119
            java.lang.String r1 = "_sc"
            boolean r1 = r12.containsKey(r1)
            if (r1 != 0) goto L_0x0119
            r0.d = r15
        L_0x0119:
            defpackage.sxn.a(r0, r12, r14)
            java.lang.String r1 = "am"
            boolean r23 = r1.equals(r8)
            defpackage.szj.f(r29)
            svv r1 = r7.x
            boolean r1 = r1.v()
            if (r1 == 0) goto L_0x0592
            szj r1 = r27.x()
            int r18 = r1.b((java.lang.String) r9)
            if (r18 == 0) goto L_0x0171
            sut r0 = r27.E()
            sur r0 = r0.e
            suk r1 = r27.y()
            java.lang.String r1 = r1.a((java.lang.String) r9)
            java.lang.String r2 = "Invalid event name. Event will not be logged (FE)"
            r0.a(r2, r1)
            szj r0 = r27.x()
            r27.v()
            r1 = 40
            java.lang.String r20 = r0.a((java.lang.String) r9, (int) r1, (boolean) r15)
            if (r9 == 0) goto L_0x0161
            int r14 = r29.length()
            r21 = r14
            goto L_0x0163
        L_0x0161:
            r21 = 0
        L_0x0163:
            svv r0 = r7.x
            szj r16 = r0.f()
            java.lang.String r19 = "_ev"
            r17 = r33
            r16.a((java.lang.String) r17, (int) r18, (java.lang.String) r19, (java.lang.String) r20, (int) r21)
            return
        L_0x0171:
            r1 = 4
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.String r2 = "_o"
            r1[r14] = r2
            java.lang.String r2 = "_sn"
            r1[r15] = r2
            r2 = 2
            java.lang.String r3 = "_sc"
            r1[r2] = r3
            r2 = 3
            java.lang.String r3 = "_si"
            r1[r2] = r3
            java.util.List r1 = java.util.Arrays.asList(r1)
            java.util.List r22 = java.util.Collections.unmodifiableList(r1)
            szj r1 = r27.x()
            r16 = 1
            r2 = r33
            r3 = r29
            r4 = r32
            r5 = r22
            r6 = r16
            android.os.Bundle r12 = r1.a((java.lang.String) r2, (java.lang.String) r3, (android.os.Bundle) r4, (java.util.List) r5, (boolean) r6)
            if (r12 == 0) goto L_0x01d4
            java.lang.String r1 = "_sc"
            boolean r1 = r12.containsKey(r1)
            if (r1 == 0) goto L_0x01d4
            java.lang.String r1 = "_si"
            boolean r1 = r12.containsKey(r1)
            if (r1 == 0) goto L_0x01d4
            java.lang.String r1 = "_sn"
            java.lang.String r1 = r12.getString(r1)
            java.lang.String r2 = "_sc"
            java.lang.String r2 = r12.getString(r2)
            java.lang.String r3 = "_si"
            long r3 = r12.getLong(r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            sxk r4 = new sxk
            long r5 = r3.longValue()
            r4.<init>(r1, r2, r5)
            goto L_0x01d5
        L_0x01d4:
            r4 = r13
        L_0x01d5:
            if (r4 == 0) goto L_0x01d9
            r0 = r4
            goto L_0x01da
        L_0x01d9:
        L_0x01da:
            spg r1 = r27.v()
            suc r2 = defpackage.sud.S
            boolean r1 = r1.a((defpackage.suc) r2)
            r5 = 0
            if (r1 == 0) goto L_0x0234
            spc r1 = r27.u()
            boolean r1 = r1.a
            if (r1 != 0) goto L_0x0234
            sxn r1 = r27.c()
            sxk r1 = r1.o()
            if (r1 == 0) goto L_0x0234
            java.lang.String r1 = "_ae"
            boolean r1 = r1.equals(r9)
            if (r1 == 0) goto L_0x0234
            sys r1 = r27.a()
            syq r1 = r1.d
            long r1 = r1.a()
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x0234
            szj r3 = r27.x()
            java.lang.String r4 = "_et"
            long r16 = r12.getLong(r4)
            int r4 = (r16 > r5 ? 1 : (r16 == r5 ? 0 : -1))
            if (r4 == 0) goto L_0x022d
            sut r3 = r3.E()
            sur r3 = r3.f
            java.lang.Long r4 = java.lang.Long.valueOf(r16)
            java.lang.String r13 = "Params already contained engagement"
            r3.a(r13, r4)
        L_0x022d:
            long r1 = r1 + r16
            java.lang.String r3 = "_et"
            r12.putLong(r3, r1)
        L_0x0234:
            boolean r1 = defpackage.ayis.b()
            if (r1 == 0) goto L_0x02b5
            spg r1 = r27.v()
            suc r2 = defpackage.sud.aC
            boolean r1 = r1.a((defpackage.suc) r2)
            if (r1 == 0) goto L_0x02b5
            java.lang.String r1 = "auto"
            boolean r1 = r1.equals(r8)
            if (r1 != 0) goto L_0x0293
            java.lang.String r1 = "_ssr"
            boolean r1 = r1.equals(r9)
            if (r1 != 0) goto L_0x0257
            goto L_0x0293
        L_0x0257:
            szj r1 = r27.x()
            java.lang.String r2 = "_ffr"
            java.lang.String r2 = r12.getString(r2)
            boolean r3 = defpackage.jlh.d(r2)
            if (r3 != 0) goto L_0x026c
            java.lang.String r13 = r2.trim()
            goto L_0x026d
        L_0x026c:
            r13 = 0
        L_0x026d:
            svf r2 = r1.w()
            sve r2 = r2.w
            java.lang.String r2 = r2.a()
            boolean r2 = defpackage.szj.b((java.lang.String) r13, (java.lang.String) r2)
            if (r2 == 0) goto L_0x0289
            sut r0 = r1.E()
            sur r0 = r0.j
            java.lang.String r1 = "Not logging duplicate session_start_with_rollout event"
            r0.a(r1)
            return
        L_0x0289:
            svf r1 = r1.w()
            sve r1 = r1.w
            r1.a(r13)
            goto L_0x02b5
        L_0x0293:
            java.lang.String r1 = "_ae"
            boolean r1 = r1.equals(r9)
            if (r1 == 0) goto L_0x02b5
            szj r1 = r27.x()
            svf r1 = r1.w()
            sve r1 = r1.w
            java.lang.String r1 = r1.a()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x02b5
            java.lang.String r2 = "_ffr"
            r12.putString(r2, r1)
        L_0x02b5:
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            r13.add(r12)
            szj r1 = r27.x()
            java.security.SecureRandom r1 = r1.e()
            long r3 = r1.nextLong()
            spg r1 = r27.v()
            suc r2 = defpackage.sud.O
            boolean r1 = r1.a((defpackage.suc) r2)
            if (r1 == 0) goto L_0x037f
            svf r1 = r27.w()
            svc r1 = r1.q
            long r1 = r1.a()
            int r16 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r16 <= 0) goto L_0x037b
            svf r1 = r27.w()
            boolean r1 = r1.a((long) r10)
            if (r1 == 0) goto L_0x0377
            svf r1 = r27.w()
            svb r1 = r1.t
            boolean r1 = r1.a()
            if (r1 == 0) goto L_0x0373
            sut r1 = r27.E()
            sur r1 = r1.k
            java.lang.String r2 = "Current session is expired, remove the session number, ID, and engagement time"
            r1.a(r2)
            spg r1 = r27.v()
            suc r2 = defpackage.sud.L
            boolean r1 = r1.a((defpackage.suc) r2)
            if (r1 == 0) goto L_0x032d
            r16 = 0
            jiq r1 = r27.A()
            long r17 = r1.a()
            java.lang.String r2 = "auto"
            java.lang.String r19 = "_sid"
            r1 = r27
            r24 = r3
            r3 = r19
            r4 = r16
            r14 = r5
            r5 = r17
            r1.a((java.lang.String) r2, (java.lang.String) r3, (java.lang.Object) r4, (long) r5)
            goto L_0x0330
        L_0x032d:
            r24 = r3
            r14 = r5
        L_0x0330:
            spg r1 = r27.v()
            suc r2 = defpackage.sud.M
            boolean r1 = r1.a((defpackage.suc) r2)
            if (r1 == 0) goto L_0x034e
            r4 = 0
            jiq r1 = r27.A()
            long r5 = r1.a()
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_sno"
            r1 = r27
            r1.a((java.lang.String) r2, (java.lang.String) r3, (java.lang.Object) r4, (long) r5)
        L_0x034e:
            boolean r1 = defpackage.aylg.b()
            if (r1 == 0) goto L_0x0382
            spg r1 = r27.v()
            suc r2 = defpackage.sud.ah
            boolean r1 = r1.a((defpackage.suc) r2)
            if (r1 == 0) goto L_0x0382
            r4 = 0
            jiq r1 = r27.A()
            long r5 = r1.a()
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_se"
            r1 = r27
            r1.a((java.lang.String) r2, (java.lang.String) r3, (java.lang.Object) r4, (long) r5)
            goto L_0x0382
        L_0x0373:
            r24 = r3
            r14 = r5
            goto L_0x0382
        L_0x0377:
            r24 = r3
            r14 = r5
            goto L_0x0382
        L_0x037b:
            r24 = r3
            r14 = r5
            goto L_0x0382
        L_0x037f:
            r24 = r3
            r14 = r5
        L_0x0382:
            spg r1 = r27.v()
            suc r2 = defpackage.sud.N
            boolean r1 = r1.a((defpackage.suc) r2)
            if (r1 == 0) goto L_0x03b1
            java.lang.String r1 = "extend_session"
            long r1 = r12.getLong(r1, r14)
            r3 = 1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x03b1
            sut r1 = r27.E()
            sur r1 = r1.k
            java.lang.String r2 = "EXTEND_SESSION param attached: initiate a new session or extend the current active session"
            r1.a(r2)
            svv r1 = r7.x
            sys r1 = r1.d()
            syr r1 = r1.c
            r2 = 1
            r1.a(r10, r2)
        L_0x03b1:
            java.util.Set r1 = r12.keySet()
            int r2 = r12.size()
            java.lang.String[] r2 = new java.lang.String[r2]
            java.lang.Object[] r1 = r1.toArray(r2)
            java.lang.String[] r1 = (java.lang.String[]) r1
            java.util.Arrays.sort(r1)
            boolean r2 = defpackage.ayij.b()
            if (r2 == 0) goto L_0x0401
            spg r2 = r27.v()
            suc r3 = defpackage.sud.aN
            boolean r2 = r2.a((defpackage.suc) r3)
            if (r2 == 0) goto L_0x0401
            spg r2 = r27.v()
            suc r3 = defpackage.sud.aM
            boolean r2 = r2.a((defpackage.suc) r3)
            if (r2 != 0) goto L_0x03e3
            goto L_0x0401
        L_0x03e3:
            int r0 = r1.length
            r2 = 0
        L_0x03e5:
            if (r2 >= r0) goto L_0x03fe
            r3 = r1[r2]
            szj r4 = r27.x()
            java.lang.Object r5 = r12.get(r3)
            android.os.Bundle[] r4 = r4.a((java.lang.Object) r5)
            if (r4 != 0) goto L_0x03f8
            goto L_0x03fb
        L_0x03f8:
            r12.putParcelableArray(r3, r4)
        L_0x03fb:
            int r2 = r2 + 1
            goto L_0x03e5
        L_0x03fe:
            r0 = 0
            goto L_0x048b
        L_0x0401:
            int r2 = r1.length
            r3 = 0
            r4 = 0
        L_0x0404:
            if (r3 >= r2) goto L_0x047a
            r5 = r1[r3]
            java.lang.Object r6 = r12.get(r5)
            szj r14 = r27.x()
            android.os.Bundle[] r6 = r14.a((java.lang.Object) r6)
            if (r6 != 0) goto L_0x041d
            r32 = r1
            r26 = r2
            r10 = r24
            goto L_0x046f
        L_0x041d:
            int r14 = r6.length
            r12.putInt(r5, r14)
            r14 = 0
        L_0x0422:
            int r15 = r6.length
            if (r14 >= r15) goto L_0x0468
            r32 = r1
            r1 = r6[r14]
            r26 = r2
            r2 = 1
            defpackage.sxn.a(r0, r1, r2)
            szj r16 = r27.x()
            r21 = 0
            java.lang.String r18 = "_ep"
            r17 = r33
            r19 = r1
            r20 = r22
            android.os.Bundle r1 = r16.a((java.lang.String) r17, (java.lang.String) r18, (android.os.Bundle) r19, (java.util.List) r20, (boolean) r21)
            java.lang.String r2 = "_en"
            r1.putString(r2, r9)
            java.lang.String r2 = "_eid"
            r10 = r24
            r1.putLong(r2, r10)
            java.lang.String r2 = "_gn"
            r1.putString(r2, r5)
            java.lang.String r2 = "_ll"
            r1.putInt(r2, r15)
            java.lang.String r2 = "_i"
            r1.putInt(r2, r14)
            r13.add(r1)
            int r14 = r14 + 1
            r1 = r32
            r2 = r26
            r10 = r30
            goto L_0x0422
        L_0x0468:
            r32 = r1
            r26 = r2
            r10 = r24
            int r4 = r4 + r15
        L_0x046f:
            int r3 = r3 + 1
            r1 = r32
            r24 = r10
            r2 = r26
            r10 = r30
            goto L_0x0404
        L_0x047a:
            r10 = r24
            if (r4 == 0) goto L_0x048a
            java.lang.String r0 = "_eid"
            r12.putLong(r0, r10)
            java.lang.String r0 = "_epc"
            r12.putInt(r0, r4)
            r0 = 0
            goto L_0x048b
        L_0x048a:
            r0 = 0
        L_0x048b:
            int r1 = r13.size()
            if (r0 >= r1) goto L_0x0567
            java.lang.Object r1 = r13.get(r0)
            android.os.Bundle r1 = (android.os.Bundle) r1
            if (r0 == 0) goto L_0x049c
            java.lang.String r2 = "_ep"
            goto L_0x049d
        L_0x049c:
            r2 = r9
        L_0x049d:
            java.lang.String r3 = "_o"
            r1.putString(r3, r8)
            szj r3 = r27.x()
            android.os.Bundle r10 = r3.a((android.os.Bundle) r1)
            boolean r1 = defpackage.ayjk.b()
            if (r1 == 0) goto L_0x04bd
            spg r1 = r27.v()
            suc r3 = defpackage.sud.aI
            boolean r1 = r1.a((defpackage.suc) r3)
            if (r1 != 0) goto L_0x04d8
        L_0x04bd:
            sut r1 = r27.E()
            sur r1 = r1.j
            suk r3 = r27.y()
            java.lang.String r3 = r3.a((java.lang.String) r9)
            suk r4 = r27.y()
            java.lang.String r4 = r4.a((android.os.Bundle) r10)
            java.lang.String r5 = "Logging event (FE)"
            r1.a(r5, r3, r4)
        L_0x04d8:
            com.google.android.gms.measurement.internal.EventParcel r11 = new com.google.android.gms.measurement.internal.EventParcel
            com.google.android.gms.measurement.internal.EventParams r3 = new com.google.android.gms.measurement.internal.EventParams
            r3.<init>(r10)
            r1 = r11
            r4 = r28
            r5 = r30
            r1.<init>(r2, r3, r4, r5)
            sye r1 = r27.d()
            defpackage.iva.a((java.lang.Object) r11)
            r1.h()
            r1.l()
            boolean r18 = r1.p()
            if (r18 == 0) goto L_0x052d
            suj r2 = r1.b()
            android.os.Parcel r3 = android.os.Parcel.obtain()
            r4 = 0
            defpackage.sps.a(r11, r3, r4)
            byte[] r4 = r3.marshall()
            r3.recycle()
            int r3 = r4.length
            r5 = 131072(0x20000, float:1.83671E-40)
            if (r3 <= r5) goto L_0x0521
            sut r2 = r2.E()
            sur r2 = r2.d
            java.lang.String r3 = "Event is too long for local database. Sending event directly to service"
            r2.a(r3)
            r3 = 0
            r19 = 0
            goto L_0x0530
        L_0x0521:
            r3 = 0
            boolean r2 = r2.a(r3, r4)
            if (r2 != 0) goto L_0x052a
            goto L_0x052e
        L_0x052a:
            r19 = 1
            goto L_0x0530
        L_0x052d:
            r3 = 0
        L_0x052e:
            r19 = 0
        L_0x0530:
            r2 = 1
            com.google.android.gms.measurement.internal.AppMetadata r21 = r1.a((boolean) r2)
            sxu r2 = new sxu
            r16 = r2
            r17 = r1
            r20 = r11
            r22 = r33
            r16.<init>(r17, r18, r19, r20, r21, r22)
            r1.a((java.lang.Runnable) r2)
            if (r23 != 0) goto L_0x0563
            java.util.Set r1 = r7.d
            java.util.Iterator r1 = r1.iterator()
        L_0x054e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0563
            java.lang.Object r2 = r1.next()
            sws r2 = (defpackage.sws) r2
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>(r10)
            r2.a()
            goto L_0x054e
        L_0x0563:
            int r0 = r0 + 1
            goto L_0x048b
        L_0x0567:
            spc r0 = r27.u()
            boolean r0 = r0.a
            if (r0 != 0) goto L_0x0591
            sxn r0 = r27.c()
            sxk r0 = r0.o()
            if (r0 == 0) goto L_0x0591
            java.lang.String r0 = "_ae"
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x0591
            sys r0 = r27.a()
            jiq r1 = r27.A()
            long r1 = r1.b()
            r3 = 1
            r0.a(r3, r3, r1)
        L_0x0591:
            return
        L_0x0592:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sxd.a(java.lang.String, java.lang.String, long, android.os.Bundle, java.lang.String):void");
    }

    /* access modifiers changed from: package-private */
    public final void a(String str, String str2, long j, Object obj) {
        F().a((Runnable) new sww(this, str, str2, obj, j));
    }

    public final void a(String str, String str2, Bundle bundle) {
        Bundle bundle2;
        long a = A().a();
        i();
        if (str == null) {
            str = "app";
        }
        String str3 = str;
        if (bundle == null) {
            bundle2 = new Bundle();
        } else {
            bundle2 = bundle;
        }
        b(str3, str2, a, bundle2, (String) null);
    }

    public final void a(String str, String str2, Bundle bundle, String str3) {
        j();
        b(str, str2, A().a(), bundle, str3);
    }

    public final void a(String str, String str2, Object obj) {
        long a = A().a();
        int c2 = x().c(str2);
        if (c2 != 0) {
            szj x = x();
            v();
            this.x.f().a(c2, "_ev", x.a(str2, 24, true), str2.length());
        } else if (obj != null) {
            int b2 = x().b(str2, obj);
            if (b2 != 0) {
                szj x2 = x();
                v();
                this.x.f().a(b2, "_ev", x2.a(str2, 24, true), ((String) obj).length());
                return;
            }
            Object c3 = x().c(str2, obj);
            if (c3 != null) {
                a(str, str2, a, c3);
            }
        } else {
            a(str, str2, a, (Object) null);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0089  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r9, java.lang.String r10, java.lang.Object r11, long r12) {
        /*
            r8 = this;
            defpackage.iva.c(r9)
            defpackage.iva.c(r10)
            r8.h()
            r8.i()
            r8.l()
            spg r0 = r8.v()
            suc r1 = defpackage.sud.V
            boolean r0 = r0.a((defpackage.suc) r1)
            java.lang.String r1 = "_npa"
            if (r0 == 0) goto L_0x0072
            java.lang.String r0 = "allow_personalized_ads"
            boolean r0 = r0.equals(r10)
            if (r0 != 0) goto L_0x0026
            goto L_0x0073
        L_0x0026:
            boolean r0 = r11 instanceof java.lang.String
            if (r0 == 0) goto L_0x0062
            r0 = r11
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x0062
            java.util.Locale r10 = java.util.Locale.ENGLISH
            java.lang.String r10 = r0.toLowerCase(r10)
            java.lang.String r11 = "false"
            boolean r10 = r11.equals(r10)
            r2 = 1
            if (r10 != 0) goto L_0x0046
            r4 = 0
            goto L_0x0047
        L_0x0046:
            r4 = r2
        L_0x0047:
            java.lang.Long r10 = java.lang.Long.valueOf(r4)
            svf r0 = r8.w()
            sve r0 = r0.n
            long r4 = r10.longValue()
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L_0x005a
            goto L_0x005c
        L_0x005a:
            java.lang.String r11 = "true"
        L_0x005c:
            r0.a(r11)
            r6 = r10
            r3 = r1
            goto L_0x0075
        L_0x0062:
            if (r11 != 0) goto L_0x0072
            svf r10 = r8.w()
            sve r10 = r10.n
            java.lang.String r0 = "unset"
            r10.a(r0)
            r6 = r11
            r3 = r1
            goto L_0x0075
        L_0x0072:
        L_0x0073:
            r3 = r10
            r6 = r11
        L_0x0075:
            svv r10 = r8.x
            boolean r10 = r10.q()
            if (r10 != 0) goto L_0x0089
            sut r9 = r8.E()
            sur r9 = r9.k
            java.lang.String r10 = "User property not set since app measurement is disabled"
            r9.a(r10)
            return
        L_0x0089:
            svv r10 = r8.x
            boolean r10 = r10.v()
            if (r10 == 0) goto L_0x00e7
            com.google.android.gms.measurement.internal.UserAttributeParcel r10 = new com.google.android.gms.measurement.internal.UserAttributeParcel
            r2 = r10
            r4 = r12
            r7 = r9
            r2.<init>(r3, r4, r6, r7)
            sye r9 = r8.d()
            r9.h()
            r9.l()
            boolean r11 = r9.p()
            r12 = 1
            r13 = 0
            if (r11 == 0) goto L_0x00d8
            suj r11 = r9.b()
            android.os.Parcel r0 = android.os.Parcel.obtain()
            defpackage.szh.a(r10, r0)
            byte[] r1 = r0.marshall()
            r0.recycle()
            int r0 = r1.length
            r2 = 131072(0x20000, float:1.83671E-40)
            if (r0 <= r2) goto L_0x00ce
            sut r11 = r11.E()
            sur r11 = r11.d
            java.lang.String r0 = "User property too long for local database. Sending directly to service"
            r11.a(r0)
            goto L_0x00d9
        L_0x00ce:
            boolean r11 = r11.a(r12, r1)
            if (r11 != 0) goto L_0x00d6
            goto L_0x00d8
        L_0x00d6:
            r13 = 1
            goto L_0x00d9
        L_0x00d8:
        L_0x00d9:
            com.google.android.gms.measurement.internal.AppMetadata r11 = r9.a((boolean) r12)
            sxo r12 = new sxo
            r12.<init>(r9, r13, r10, r11)
            r9.a((java.lang.Runnable) r12)
            return
        L_0x00e7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sxd.a(java.lang.String, java.lang.String, java.lang.Object, long):void");
    }

    public final void a(String str, String str2, String str3, Bundle bundle) {
        long a = A().a();
        iva.c(str2);
        Bundle bundle2 = new Bundle();
        if (str != null) {
            bundle2.putString("app_id", str);
        }
        bundle2.putString("name", str2);
        bundle2.putLong("creation_timestamp", a);
        if (str3 != null) {
            bundle2.putString("expired_event_name", str3);
            bundle2.putBundle("expired_event_params", bundle);
        }
        F().a((Runnable) new swy(this, bundle2));
    }
}
