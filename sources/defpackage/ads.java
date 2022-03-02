package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* renamed from: ads  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ads {
    private static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;
    private static ads b;
    private static final oi i = new oi(6);
    private WeakHashMap c;
    private ou d;
    private ov e;
    private final WeakHashMap f = new WeakHashMap(0);
    private TypedValue g;
    private boolean h;
    private yt j;

    private static long a(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    public final synchronized void a(yt ytVar) {
        this.j = ytVar;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0006, code lost:
        r0 = (defpackage.ov) r0.get(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0148, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.content.res.ColorStateList b(android.content.Context r10, int r11) {
        /*
            r9 = this;
            monitor-enter(r9)
            java.util.WeakHashMap r0 = r9.c     // Catch:{ all -> 0x0149 }
            r1 = 0
            if (r0 == 0) goto L_0x0015
            java.lang.Object r0 = r0.get(r10)     // Catch:{ all -> 0x0149 }
            ov r0 = (defpackage.ov) r0     // Catch:{ all -> 0x0149 }
            if (r0 == 0) goto L_0x0015
            java.lang.Object r0 = r0.a(r11)     // Catch:{ all -> 0x0149 }
            android.content.res.ColorStateList r0 = (android.content.res.ColorStateList) r0     // Catch:{ all -> 0x0149 }
            goto L_0x0016
        L_0x0015:
            r0 = r1
        L_0x0016:
            if (r0 != 0) goto L_0x0146
            yt r0 = r9.j     // Catch:{ all -> 0x0149 }
            if (r0 == 0) goto L_0x011a
            r2 = 2131230805(0x7f080055, float:1.8077673E38)
            if (r11 != r2) goto L_0x002a
            r0 = 2131099669(0x7f060015, float:1.7811698E38)
            android.content.res.ColorStateList r1 = defpackage.uj.a(r10, r0)     // Catch:{ all -> 0x0149 }
            goto L_0x011b
        L_0x002a:
            r2 = 2131230861(0x7f08008d, float:1.8077787E38)
            if (r11 != r2) goto L_0x0038
            r0 = 2131099672(0x7f060018, float:1.7811704E38)
            android.content.res.ColorStateList r1 = defpackage.uj.a(r10, r0)     // Catch:{ all -> 0x0149 }
            goto L_0x011b
        L_0x0038:
            r2 = 2131230860(0x7f08008c, float:1.8077785E38)
            r3 = 0
            if (r11 != r2) goto L_0x009d
            r0 = 3
            int[][] r1 = new int[r0][]     // Catch:{ all -> 0x0149 }
            int[] r0 = new int[r0]     // Catch:{ all -> 0x0149 }
            r2 = 2130968901(0x7f040145, float:1.7546469E38)
            android.content.res.ColorStateList r4 = defpackage.aeq.b(r10, r2)     // Catch:{ all -> 0x0149 }
            r5 = 2130968866(0x7f040122, float:1.7546398E38)
            r6 = 2
            r7 = 1
            if (r4 == 0) goto L_0x0077
            boolean r8 = r4.isStateful()     // Catch:{ all -> 0x0149 }
            if (r8 != 0) goto L_0x0058
            goto L_0x0077
        L_0x0058:
            int[] r2 = defpackage.aeq.a     // Catch:{ all -> 0x0149 }
            r1[r3] = r2     // Catch:{ all -> 0x0149 }
            int r2 = r4.getColorForState(r2, r3)     // Catch:{ all -> 0x0149 }
            r0[r3] = r2     // Catch:{ all -> 0x0149 }
            int[] r2 = defpackage.aeq.d     // Catch:{ all -> 0x0149 }
            r1[r7] = r2     // Catch:{ all -> 0x0149 }
            int r2 = defpackage.aeq.a((android.content.Context) r10, (int) r5)     // Catch:{ all -> 0x0149 }
            r0[r7] = r2     // Catch:{ all -> 0x0149 }
            int[] r2 = defpackage.aeq.e     // Catch:{ all -> 0x0149 }
            r1[r6] = r2     // Catch:{ all -> 0x0149 }
            int r2 = r4.getDefaultColor()     // Catch:{ all -> 0x0149 }
            r0[r6] = r2     // Catch:{ all -> 0x0149 }
            goto L_0x0095
        L_0x0077:
            int[] r4 = defpackage.aeq.a     // Catch:{ all -> 0x0149 }
            r1[r3] = r4     // Catch:{ all -> 0x0149 }
            int r4 = defpackage.aeq.c(r10, r2)     // Catch:{ all -> 0x0149 }
            r0[r3] = r4     // Catch:{ all -> 0x0149 }
            int[] r3 = defpackage.aeq.d     // Catch:{ all -> 0x0149 }
            r1[r7] = r3     // Catch:{ all -> 0x0149 }
            int r3 = defpackage.aeq.a((android.content.Context) r10, (int) r5)     // Catch:{ all -> 0x0149 }
            r0[r7] = r3     // Catch:{ all -> 0x0149 }
            int[] r3 = defpackage.aeq.e     // Catch:{ all -> 0x0149 }
            r1[r6] = r3     // Catch:{ all -> 0x0149 }
            int r2 = defpackage.aeq.a((android.content.Context) r10, (int) r2)     // Catch:{ all -> 0x0149 }
            r0[r6] = r2     // Catch:{ all -> 0x0149 }
        L_0x0095:
            android.content.res.ColorStateList r2 = new android.content.res.ColorStateList     // Catch:{ all -> 0x0149 }
            r2.<init>(r1, r0)     // Catch:{ all -> 0x0149 }
            r1 = r2
            goto L_0x011b
        L_0x009d:
            r2 = 2131230793(0x7f080049, float:1.8077649E38)
            if (r11 != r2) goto L_0x00af
            r0 = 2130968865(0x7f040121, float:1.7546396E38)
            int r0 = defpackage.aeq.a((android.content.Context) r10, (int) r0)     // Catch:{ all -> 0x0149 }
            android.content.res.ColorStateList r1 = defpackage.yt.a((android.content.Context) r10, (int) r0)     // Catch:{ all -> 0x0149 }
            goto L_0x011b
        L_0x00af:
            r2 = 2131230787(0x7f080043, float:1.8077637E38)
            if (r11 != r2) goto L_0x00b9
            android.content.res.ColorStateList r1 = defpackage.yt.a((android.content.Context) r10, (int) r3)     // Catch:{ all -> 0x0149 }
            goto L_0x011b
        L_0x00b9:
            r2 = 2131230792(0x7f080048, float:1.8077647E38)
            if (r11 != r2) goto L_0x00ca
            r0 = 2130968862(0x7f04011e, float:1.754639E38)
            int r0 = defpackage.aeq.a((android.content.Context) r10, (int) r0)     // Catch:{ all -> 0x0149 }
            android.content.res.ColorStateList r1 = defpackage.yt.a((android.content.Context) r10, (int) r0)     // Catch:{ all -> 0x0149 }
            goto L_0x011b
        L_0x00ca:
            r2 = 2131230858(0x7f08008a, float:1.807778E38)
            if (r11 != r2) goto L_0x00d0
            goto L_0x0112
        L_0x00d0:
            r2 = 2131230859(0x7f08008b, float:1.8077783E38)
            if (r11 == r2) goto L_0x0112
            int[] r2 = r0.b     // Catch:{ all -> 0x0149 }
            boolean r2 = defpackage.yt.a((int[]) r2, (int) r11)     // Catch:{ all -> 0x0149 }
            if (r2 == 0) goto L_0x00e5
            r0 = 2130968868(0x7f040124, float:1.7546402E38)
            android.content.res.ColorStateList r1 = defpackage.aeq.b(r10, r0)     // Catch:{ all -> 0x0149 }
            goto L_0x011b
        L_0x00e5:
            int[] r2 = r0.e     // Catch:{ all -> 0x0149 }
            boolean r2 = defpackage.yt.a((int[]) r2, (int) r11)     // Catch:{ all -> 0x0149 }
            if (r2 == 0) goto L_0x00f5
            r0 = 2131099668(0x7f060014, float:1.7811696E38)
            android.content.res.ColorStateList r1 = defpackage.uj.a(r10, r0)     // Catch:{ all -> 0x0149 }
            goto L_0x011b
        L_0x00f5:
            int[] r0 = r0.f     // Catch:{ all -> 0x0149 }
            boolean r0 = defpackage.yt.a((int[]) r0, (int) r11)     // Catch:{ all -> 0x0149 }
            if (r0 == 0) goto L_0x0105
            r0 = 2131099667(0x7f060013, float:1.7811694E38)
            android.content.res.ColorStateList r1 = defpackage.uj.a(r10, r0)     // Catch:{ all -> 0x0149 }
            goto L_0x011b
        L_0x0105:
            r0 = 2131230852(0x7f080084, float:1.8077768E38)
            if (r11 != r0) goto L_0x011a
            r0 = 2131099670(0x7f060016, float:1.78117E38)
            android.content.res.ColorStateList r1 = defpackage.uj.a(r10, r0)     // Catch:{ all -> 0x0149 }
            goto L_0x011a
        L_0x0112:
            r0 = 2131099671(0x7f060017, float:1.7811702E38)
            android.content.res.ColorStateList r1 = defpackage.uj.a(r10, r0)     // Catch:{ all -> 0x0149 }
            goto L_0x011b
        L_0x011a:
        L_0x011b:
            if (r1 == 0) goto L_0x0144
            java.util.WeakHashMap r0 = r9.c     // Catch:{ all -> 0x0149 }
            if (r0 == 0) goto L_0x0122
            goto L_0x0129
        L_0x0122:
            java.util.WeakHashMap r0 = new java.util.WeakHashMap     // Catch:{ all -> 0x0149 }
            r0.<init>()     // Catch:{ all -> 0x0149 }
            r9.c = r0     // Catch:{ all -> 0x0149 }
        L_0x0129:
            java.util.WeakHashMap r0 = r9.c     // Catch:{ all -> 0x0149 }
            java.lang.Object r0 = r0.get(r10)     // Catch:{ all -> 0x0149 }
            ov r0 = (defpackage.ov) r0     // Catch:{ all -> 0x0149 }
            if (r0 != 0) goto L_0x013e
            ov r0 = new ov     // Catch:{ all -> 0x0149 }
            r0.<init>()     // Catch:{ all -> 0x0149 }
            java.util.WeakHashMap r2 = r9.c     // Catch:{ all -> 0x0149 }
            r2.put(r10, r0)     // Catch:{ all -> 0x0149 }
            goto L_0x013f
        L_0x013e:
        L_0x013f:
            r0.c(r11, r1)     // Catch:{ all -> 0x0149 }
            monitor-exit(r9)
            return r1
        L_0x0144:
            r0 = r1
            goto L_0x0147
        L_0x0146:
        L_0x0147:
            monitor-exit(r9)
            return r0
        L_0x0149:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ads.b(android.content.Context, int):android.content.res.ColorStateList");
    }

    public static synchronized ads a() {
        ads ads;
        synchronized (ads.class) {
            if (b == null) {
                ads ads2 = new ads();
                b = ads2;
                if (Build.VERSION.SDK_INT < 24) {
                    ads2.a("vector", (adq) new adr());
                    ads2.a("animated-vector", (adq) new adp());
                    ads2.a("animated-selector", (adq) new ado());
                }
            }
            ads = b;
        }
        return ads;
    }

    public static synchronized PorterDuffColorFilter a(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (ads.class) {
            porterDuffColorFilter = (PorterDuffColorFilter) i.a((Object) Integer.valueOf(oi.a(i2, mode)));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i2, mode);
                PorterDuffColorFilter porterDuffColorFilter2 = (PorterDuffColorFilter) i.a((Object) Integer.valueOf(oi.a(i2, mode)), (Object) porterDuffColorFilter);
            }
        }
        return porterDuffColorFilter;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0043, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized android.graphics.drawable.Drawable a(android.content.Context r4, long r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.WeakHashMap r0 = r3.f     // Catch:{ all -> 0x0046 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0046 }
            oh r0 = (defpackage.oh) r0     // Catch:{ all -> 0x0046 }
            r1 = 0
            if (r0 == 0) goto L_0x0044
            java.lang.Object r2 = r0.a((long) r5)     // Catch:{ all -> 0x0046 }
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch:{ all -> 0x0046 }
            if (r2 == 0) goto L_0x0042
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x0046 }
            android.graphics.drawable.Drawable$ConstantState r2 = (android.graphics.drawable.Drawable.ConstantState) r2     // Catch:{ all -> 0x0046 }
            if (r2 != 0) goto L_0x0038
            long[] r4 = r0.c     // Catch:{ all -> 0x0046 }
            int r2 = r0.e     // Catch:{ all -> 0x0046 }
            int r4 = defpackage.og.a((long[]) r4, (int) r2, (long) r5)     // Catch:{ all -> 0x0046 }
            if (r4 < 0) goto L_0x0042
            java.lang.Object[] r5 = r0.d     // Catch:{ all -> 0x0046 }
            r5 = r5[r4]     // Catch:{ all -> 0x0046 }
            java.lang.Object r6 = defpackage.oh.a     // Catch:{ all -> 0x0046 }
            if (r5 == r6) goto L_0x0042
            java.lang.Object[] r5 = r0.d     // Catch:{ all -> 0x0046 }
            java.lang.Object r6 = defpackage.oh.a     // Catch:{ all -> 0x0046 }
            r5[r4] = r6     // Catch:{ all -> 0x0046 }
            r4 = 1
            r0.b = r4     // Catch:{ all -> 0x0046 }
            goto L_0x0042
        L_0x0038:
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ all -> 0x0046 }
            android.graphics.drawable.Drawable r4 = r2.newDrawable(r4)     // Catch:{ all -> 0x0046 }
            monitor-exit(r3)
            return r4
        L_0x0042:
            monitor-exit(r3)
            return r1
        L_0x0044:
            monitor-exit(r3)
            return r1
        L_0x0046:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ads.a(android.content.Context, long):android.graphics.drawable.Drawable");
    }

    private final synchronized void a(Context context, long j2, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            oh ohVar = (oh) this.f.get(context);
            if (ohVar == null) {
                ohVar = new oh();
                this.f.put(context, ohVar);
            }
            ohVar.b(j2, new WeakReference(constantState));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void a(android.graphics.drawable.Drawable r3, defpackage.aet r4, int[] r5) {
        /*
            boolean r0 = defpackage.aak.c(r3)
            if (r0 == 0) goto L_0x000e
            android.graphics.drawable.Drawable r0 = r3.mutate()
            if (r0 != r3) goto L_0x000d
            goto L_0x000e
        L_0x000d:
            return
        L_0x000e:
            boolean r0 = r4.d
            r1 = 0
            if (r0 != 0) goto L_0x001d
            boolean r0 = r4.c
            if (r0 != 0) goto L_0x001b
            r3.clearColorFilter()
            goto L_0x003b
        L_0x001b:
            r0 = r1
            goto L_0x001f
        L_0x001d:
            android.content.res.ColorStateList r0 = r4.a
        L_0x001f:
            boolean r2 = r4.c
            if (r2 != 0) goto L_0x0026
            android.graphics.PorterDuff$Mode r4 = a
            goto L_0x0028
        L_0x0026:
            android.graphics.PorterDuff$Mode r4 = r4.b
        L_0x0028:
            if (r0 != 0) goto L_0x002b
            goto L_0x0038
        L_0x002b:
            if (r4 == 0) goto L_0x0037
            r1 = 0
            int r5 = r0.getColorForState(r5, r1)
            android.graphics.PorterDuffColorFilter r1 = a((int) r5, (android.graphics.PorterDuff.Mode) r4)
            goto L_0x0038
        L_0x0037:
        L_0x0038:
            r3.setColorFilter(r1)
        L_0x003b:
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 23
            if (r4 > r5) goto L_0x0044
            r3.invalidateSelf()
        L_0x0044:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ads.a(android.graphics.drawable.Drawable, aet, int[]):void");
    }

    private final void a(String str, adq adq) {
        if (this.d == null) {
            this.d = new ou();
        }
        this.d.put(str, adq);
    }

    public final synchronized Drawable a(Context context, int i2) {
        return a(context, i2, false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: android.graphics.PorterDuff$Mode} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v1, types: [android.graphics.drawable.Drawable] */
    /* JADX WARNING: type inference failed for: r4v2 */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x026c  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0149  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.graphics.drawable.Drawable a(android.content.Context r13, int r14, boolean r15) {
        /*
            r12 = this;
            monitor-enter(r12)
            boolean r0 = r12.h     // Catch:{ all -> 0x0271 }
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0031
            r12.h = r2     // Catch:{ all -> 0x0271 }
            r0 = 2131230876(0x7f08009c, float:1.8077817E38)
            android.graphics.drawable.Drawable r0 = r12.a((android.content.Context) r13, (int) r0)     // Catch:{ all -> 0x0271 }
            if (r0 == 0) goto L_0x0027
            boolean r3 = r0 instanceof defpackage.atg     // Catch:{ all -> 0x0271 }
            if (r3 != 0) goto L_0x0031
            java.lang.String r3 = "android.graphics.drawable.VectorDrawable"
            java.lang.Class r0 = r0.getClass()     // Catch:{ all -> 0x0271 }
            java.lang.String r0 = r0.getName()     // Catch:{ all -> 0x0271 }
            boolean r0 = r3.equals(r0)     // Catch:{ all -> 0x0271 }
            if (r0 == 0) goto L_0x0027
            goto L_0x0031
        L_0x0027:
            r12.h = r1     // Catch:{ all -> 0x0271 }
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0271 }
            java.lang.String r14 = "This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat."
            r13.<init>(r14)     // Catch:{ all -> 0x0271 }
            throw r13     // Catch:{ all -> 0x0271 }
        L_0x0031:
            ou r0 = r12.d     // Catch:{ all -> 0x0271 }
            r3 = 2
            r4 = 0
            if (r0 == 0) goto L_0x00f0
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0271 }
            if (r0 != 0) goto L_0x00f0
            ov r0 = r12.e     // Catch:{ all -> 0x0271 }
            if (r0 == 0) goto L_0x0060
            java.lang.Object r0 = r0.a(r14)     // Catch:{ all -> 0x0271 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0271 }
            java.lang.String r5 = "appcompat_skip_skip"
            boolean r5 = r5.equals(r0)     // Catch:{ all -> 0x0271 }
            if (r5 == 0) goto L_0x0052
            r8 = r4
            goto L_0x00f1
        L_0x0052:
            if (r0 == 0) goto L_0x0067
            ou r5 = r12.d     // Catch:{ all -> 0x0271 }
            java.lang.Object r0 = r5.get(r0)     // Catch:{ all -> 0x0271 }
            if (r0 == 0) goto L_0x005d
            goto L_0x0067
        L_0x005d:
            r8 = r4
            goto L_0x00f1
        L_0x0060:
            ov r0 = new ov     // Catch:{ all -> 0x0271 }
            r0.<init>()     // Catch:{ all -> 0x0271 }
            r12.e = r0     // Catch:{ all -> 0x0271 }
        L_0x0067:
            android.util.TypedValue r0 = r12.g     // Catch:{ all -> 0x0271 }
            if (r0 == 0) goto L_0x006c
            goto L_0x0073
        L_0x006c:
            android.util.TypedValue r0 = new android.util.TypedValue     // Catch:{ all -> 0x0271 }
            r0.<init>()     // Catch:{ all -> 0x0271 }
            r12.g = r0     // Catch:{ all -> 0x0271 }
        L_0x0073:
            android.util.TypedValue r0 = r12.g     // Catch:{ all -> 0x0271 }
            android.content.res.Resources r5 = r13.getResources()     // Catch:{ all -> 0x0271 }
            r5.getValue(r14, r0, r2)     // Catch:{ all -> 0x0271 }
            long r6 = a((android.util.TypedValue) r0)     // Catch:{ all -> 0x0271 }
            android.graphics.drawable.Drawable r8 = r12.a((android.content.Context) r13, (long) r6)     // Catch:{ all -> 0x0271 }
            if (r8 != 0) goto L_0x00ef
            java.lang.CharSequence r9 = r0.string     // Catch:{ all -> 0x0271 }
            if (r9 == 0) goto L_0x00e4
            java.lang.CharSequence r9 = r0.string     // Catch:{ all -> 0x0271 }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x0271 }
            java.lang.String r10 = ".xml"
            boolean r9 = r9.endsWith(r10)     // Catch:{ all -> 0x0271 }
            if (r9 == 0) goto L_0x00e4
            android.content.res.XmlResourceParser r5 = r5.getXml(r14)     // Catch:{ Exception -> 0x00db }
            android.util.AttributeSet r9 = android.util.Xml.asAttributeSet(r5)     // Catch:{ Exception -> 0x00db }
        L_0x00a0:
            int r10 = r5.next()     // Catch:{ Exception -> 0x00db }
            if (r10 != r3) goto L_0x00d0
            java.lang.String r10 = r5.getName()     // Catch:{ Exception -> 0x00db }
            ov r11 = r12.e     // Catch:{ Exception -> 0x00db }
            r11.c(r14, r10)     // Catch:{ Exception -> 0x00db }
            ou r11 = r12.d     // Catch:{ Exception -> 0x00db }
            java.lang.Object r10 = r11.get(r10)     // Catch:{ Exception -> 0x00db }
            adq r10 = (defpackage.adq) r10     // Catch:{ Exception -> 0x00db }
            if (r10 == 0) goto L_0x00c2
            android.content.res.Resources$Theme r11 = r13.getTheme()     // Catch:{ Exception -> 0x00db }
            android.graphics.drawable.Drawable r8 = r10.a(r13, r5, r9, r11)     // Catch:{ Exception -> 0x00db }
            goto L_0x00c3
        L_0x00c2:
        L_0x00c3:
            if (r8 == 0) goto L_0x00e5
            int r0 = r0.changingConfigurations     // Catch:{ Exception -> 0x00ce }
            r8.setChangingConfigurations(r0)     // Catch:{ Exception -> 0x00ce }
            r12.a((android.content.Context) r13, (long) r6, (android.graphics.drawable.Drawable) r8)     // Catch:{ Exception -> 0x00ce }
            goto L_0x00e5
        L_0x00ce:
            r0 = move-exception
            goto L_0x00dc
        L_0x00d0:
            if (r10 == r2) goto L_0x00d3
            goto L_0x00a0
        L_0x00d3:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x00db }
            java.lang.String r5 = "No start tag found"
            r0.<init>(r5)     // Catch:{ Exception -> 0x00db }
            throw r0     // Catch:{ Exception -> 0x00db }
        L_0x00db:
            r0 = move-exception
        L_0x00dc:
            java.lang.String r5 = "ResourceManagerInternal"
            java.lang.String r6 = "Exception while inflating drawable"
            android.util.Log.e(r5, r6, r0)     // Catch:{ all -> 0x0271 }
            goto L_0x00e5
        L_0x00e4:
        L_0x00e5:
            if (r8 != 0) goto L_0x00f1
            ov r0 = r12.e     // Catch:{ all -> 0x0271 }
            java.lang.String r5 = "appcompat_skip_skip"
            r0.c(r14, r5)     // Catch:{ all -> 0x0271 }
            goto L_0x00f1
        L_0x00ef:
            goto L_0x00f1
        L_0x00f0:
            r8 = r4
        L_0x00f1:
            if (r8 != 0) goto L_0x0141
            android.util.TypedValue r0 = r12.g     // Catch:{ all -> 0x0271 }
            if (r0 == 0) goto L_0x00f8
            goto L_0x00ff
        L_0x00f8:
            android.util.TypedValue r0 = new android.util.TypedValue     // Catch:{ all -> 0x0271 }
            r0.<init>()     // Catch:{ all -> 0x0271 }
            r12.g = r0     // Catch:{ all -> 0x0271 }
        L_0x00ff:
            android.util.TypedValue r0 = r12.g     // Catch:{ all -> 0x0271 }
            android.content.res.Resources r5 = r13.getResources()     // Catch:{ all -> 0x0271 }
            r5.getValue(r14, r0, r2)     // Catch:{ all -> 0x0271 }
            long r5 = a((android.util.TypedValue) r0)     // Catch:{ all -> 0x0271 }
            android.graphics.drawable.Drawable r8 = r12.a((android.content.Context) r13, (long) r5)     // Catch:{ all -> 0x0271 }
            if (r8 != 0) goto L_0x0141
            yt r7 = r12.j     // Catch:{ all -> 0x0271 }
            if (r7 == 0) goto L_0x0136
            r7 = 2131230801(0x7f080051, float:1.8077665E38)
            if (r14 != r7) goto L_0x0136
            android.graphics.drawable.LayerDrawable r7 = new android.graphics.drawable.LayerDrawable     // Catch:{ all -> 0x0271 }
            android.graphics.drawable.Drawable[] r3 = new android.graphics.drawable.Drawable[r3]     // Catch:{ all -> 0x0271 }
            r8 = 2131230800(0x7f080050, float:1.8077663E38)
            android.graphics.drawable.Drawable r8 = r12.a((android.content.Context) r13, (int) r8)     // Catch:{ all -> 0x0271 }
            r3[r1] = r8     // Catch:{ all -> 0x0271 }
            r8 = 2131230802(0x7f080052, float:1.8077667E38)
            android.graphics.drawable.Drawable r8 = r12.a((android.content.Context) r13, (int) r8)     // Catch:{ all -> 0x0271 }
            r3[r2] = r8     // Catch:{ all -> 0x0271 }
            r7.<init>(r3)     // Catch:{ all -> 0x0271 }
            r8 = r7
            goto L_0x0137
        L_0x0136:
            r8 = r4
        L_0x0137:
            if (r8 == 0) goto L_0x0141
            int r0 = r0.changingConfigurations     // Catch:{ all -> 0x0271 }
            r8.setChangingConfigurations(r0)     // Catch:{ all -> 0x0271 }
            r12.a((android.content.Context) r13, (long) r5, (android.graphics.drawable.Drawable) r8)     // Catch:{ all -> 0x0271 }
        L_0x0141:
            if (r8 != 0) goto L_0x0147
            android.graphics.drawable.Drawable r8 = defpackage.kf.a((android.content.Context) r13, (int) r14)     // Catch:{ all -> 0x0271 }
        L_0x0147:
            if (r8 == 0) goto L_0x0268
            android.content.res.ColorStateList r0 = r12.b(r13, r14)     // Catch:{ all -> 0x0271 }
            if (r0 != 0) goto L_0x0240
            yt r0 = r12.j     // Catch:{ all -> 0x0271 }
            r3 = 2130968866(0x7f040122, float:1.7546398E38)
            r5 = 2130968868(0x7f040124, float:1.7546402E38)
            if (r0 == 0) goto L_0x01cf
            r6 = 2131230854(0x7f080086, float:1.8077773E38)
            r7 = 16908301(0x102000d, float:2.3877265E-38)
            r9 = 16908303(0x102000f, float:2.387727E-38)
            r10 = 16908288(0x1020000, float:2.387723E-38)
            if (r14 != r6) goto L_0x0192
            r14 = r8
            android.graphics.drawable.LayerDrawable r14 = (android.graphics.drawable.LayerDrawable) r14     // Catch:{ all -> 0x0271 }
            android.graphics.drawable.Drawable r15 = r14.findDrawableByLayerId(r10)     // Catch:{ all -> 0x0271 }
            int r0 = defpackage.aeq.a((android.content.Context) r13, (int) r5)     // Catch:{ all -> 0x0271 }
            android.graphics.PorterDuff$Mode r1 = defpackage.yu.a     // Catch:{ all -> 0x0271 }
            defpackage.yt.a(r15, r0, r1)     // Catch:{ all -> 0x0271 }
            android.graphics.drawable.Drawable r15 = r14.findDrawableByLayerId(r9)     // Catch:{ all -> 0x0271 }
            int r0 = defpackage.aeq.a((android.content.Context) r13, (int) r5)     // Catch:{ all -> 0x0271 }
            android.graphics.PorterDuff$Mode r1 = defpackage.yu.a     // Catch:{ all -> 0x0271 }
            defpackage.yt.a(r15, r0, r1)     // Catch:{ all -> 0x0271 }
            android.graphics.drawable.Drawable r14 = r14.findDrawableByLayerId(r7)     // Catch:{ all -> 0x0271 }
            int r13 = defpackage.aeq.a((android.content.Context) r13, (int) r3)     // Catch:{ all -> 0x0271 }
            android.graphics.PorterDuff$Mode r15 = defpackage.yu.a     // Catch:{ all -> 0x0271 }
            defpackage.yt.a(r14, r13, r15)     // Catch:{ all -> 0x0271 }
            goto L_0x0269
        L_0x0192:
            r6 = 2131230845(0x7f08007d, float:1.8077754E38)
            if (r14 != r6) goto L_0x0198
            goto L_0x01a3
        L_0x0198:
            r6 = 2131230844(0x7f08007c, float:1.8077752E38)
            if (r14 == r6) goto L_0x01a3
            r6 = 2131230846(0x7f08007e, float:1.8077756E38)
            if (r14 == r6) goto L_0x01a3
            goto L_0x01cf
        L_0x01a3:
            r14 = r8
            android.graphics.drawable.LayerDrawable r14 = (android.graphics.drawable.LayerDrawable) r14     // Catch:{ all -> 0x0271 }
            android.graphics.drawable.Drawable r15 = r14.findDrawableByLayerId(r10)     // Catch:{ all -> 0x0271 }
            int r0 = defpackage.aeq.c(r13, r5)     // Catch:{ all -> 0x0271 }
            android.graphics.PorterDuff$Mode r1 = defpackage.yu.a     // Catch:{ all -> 0x0271 }
            defpackage.yt.a(r15, r0, r1)     // Catch:{ all -> 0x0271 }
            android.graphics.drawable.Drawable r15 = r14.findDrawableByLayerId(r9)     // Catch:{ all -> 0x0271 }
            int r0 = defpackage.aeq.a((android.content.Context) r13, (int) r3)     // Catch:{ all -> 0x0271 }
            android.graphics.PorterDuff$Mode r1 = defpackage.yu.a     // Catch:{ all -> 0x0271 }
            defpackage.yt.a(r15, r0, r1)     // Catch:{ all -> 0x0271 }
            android.graphics.drawable.Drawable r14 = r14.findDrawableByLayerId(r7)     // Catch:{ all -> 0x0271 }
            int r13 = defpackage.aeq.a((android.content.Context) r13, (int) r3)     // Catch:{ all -> 0x0271 }
            android.graphics.PorterDuff$Mode r15 = defpackage.yu.a     // Catch:{ all -> 0x0271 }
            defpackage.yt.a(r14, r13, r15)     // Catch:{ all -> 0x0271 }
            goto L_0x0269
        L_0x01cf:
            if (r0 == 0) goto L_0x023d
            android.graphics.PorterDuff$Mode r6 = defpackage.yu.a     // Catch:{ all -> 0x0271 }
            int[] r7 = r0.a     // Catch:{ all -> 0x0271 }
            boolean r7 = defpackage.yt.a((int[]) r7, (int) r14)     // Catch:{ all -> 0x0271 }
            r9 = 16842801(0x1010031, float:2.3693695E-38)
            r10 = -1
            if (r7 == 0) goto L_0x01e5
            r14 = -1
            r1 = 1
            r9 = 2130968868(0x7f040124, float:1.7546402E38)
            goto L_0x021e
        L_0x01e5:
            int[] r5 = r0.c     // Catch:{ all -> 0x0271 }
            boolean r5 = defpackage.yt.a((int[]) r5, (int) r14)     // Catch:{ all -> 0x0271 }
            if (r5 == 0) goto L_0x01f3
            r14 = -1
            r1 = 1
            r9 = 2130968866(0x7f040122, float:1.7546398E38)
            goto L_0x021e
        L_0x01f3:
            int[] r0 = r0.d     // Catch:{ all -> 0x0271 }
            boolean r0 = defpackage.yt.a((int[]) r0, (int) r14)     // Catch:{ all -> 0x0271 }
            if (r0 == 0) goto L_0x0200
            android.graphics.PorterDuff$Mode r6 = android.graphics.PorterDuff.Mode.MULTIPLY     // Catch:{ all -> 0x0271 }
            r14 = -1
            r1 = 1
            goto L_0x021e
        L_0x0200:
            r0 = 2131230831(0x7f08006f, float:1.8077726E38)
            if (r14 != r0) goto L_0x0214
            r14 = 1109603123(0x42233333, float:40.8)
            int r14 = java.lang.Math.round(r14)     // Catch:{ all -> 0x0271 }
            r1 = 16842800(0x1010030, float:2.3693693E-38)
            r1 = 1
            r9 = 16842800(0x1010030, float:2.3693693E-38)
            goto L_0x021e
        L_0x0214:
            r0 = 2131230804(0x7f080054, float:1.8077671E38)
            if (r14 != r0) goto L_0x021c
            r14 = -1
            r1 = 1
            goto L_0x021e
        L_0x021c:
            r14 = -1
            r9 = 0
        L_0x021e:
            if (r1 == 0) goto L_0x023d
            boolean r15 = defpackage.aak.c(r8)     // Catch:{ all -> 0x0271 }
            if (r15 == 0) goto L_0x022b
            android.graphics.drawable.Drawable r15 = r8.mutate()     // Catch:{ all -> 0x0271 }
            goto L_0x022c
        L_0x022b:
            r15 = r8
        L_0x022c:
            int r13 = defpackage.aeq.a((android.content.Context) r13, (int) r9)     // Catch:{ all -> 0x0271 }
            android.graphics.PorterDuffColorFilter r13 = defpackage.yu.a((int) r13, (android.graphics.PorterDuff.Mode) r6)     // Catch:{ all -> 0x0271 }
            r15.setColorFilter(r13)     // Catch:{ all -> 0x0271 }
            if (r14 == r10) goto L_0x023c
            r15.setAlpha(r14)     // Catch:{ all -> 0x0271 }
        L_0x023c:
            goto L_0x0269
        L_0x023d:
            if (r15 != 0) goto L_0x026a
            goto L_0x0269
        L_0x0240:
            boolean r13 = defpackage.aak.c(r8)     // Catch:{ all -> 0x0271 }
            if (r13 == 0) goto L_0x024b
            android.graphics.drawable.Drawable r8 = r8.mutate()     // Catch:{ all -> 0x0271 }
            goto L_0x024c
        L_0x024b:
        L_0x024c:
            android.graphics.drawable.Drawable r13 = defpackage.ma.f(r8)     // Catch:{ all -> 0x0271 }
            defpackage.ma.a((android.graphics.drawable.Drawable) r13, (android.content.res.ColorStateList) r0)     // Catch:{ all -> 0x0271 }
            yt r15 = r12.j     // Catch:{ all -> 0x0271 }
            if (r15 == 0) goto L_0x025f
            r15 = 2131230860(0x7f08008c, float:1.8077785E38)
            if (r14 != r15) goto L_0x025f
            android.graphics.PorterDuff$Mode r4 = android.graphics.PorterDuff.Mode.MULTIPLY     // Catch:{ all -> 0x0271 }
            goto L_0x0260
        L_0x025f:
        L_0x0260:
            if (r4 == 0) goto L_0x0265
            defpackage.ma.a((android.graphics.drawable.Drawable) r13, (android.graphics.PorterDuff.Mode) r4)     // Catch:{ all -> 0x0271 }
        L_0x0265:
            r4 = r13
            goto L_0x026a
        L_0x0268:
        L_0x0269:
            r4 = r8
        L_0x026a:
            if (r4 == 0) goto L_0x026f
            defpackage.aak.b(r4)     // Catch:{ all -> 0x0271 }
        L_0x026f:
            monitor-exit(r12)
            return r4
        L_0x0271:
            r13 = move-exception
            monitor-exit(r12)
            goto L_0x0275
        L_0x0274:
            throw r13
        L_0x0275:
            goto L_0x0274
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ads.a(android.content.Context, int, boolean):android.graphics.drawable.Drawable");
    }

    public final synchronized void a(Context context) {
        oh ohVar = (oh) this.f.get(context);
        if (ohVar != null) {
            ohVar.c();
        }
    }
}
