package defpackage;

import android.util.Log;

/* renamed from: ahnv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahnv {
    private int a = -1;

    private final int a(int i) {
        if (i == 0) {
            Log.w("TransitionAHandler", "Received car fusion result. Entering Vehicle");
            this.a = 0;
            return 2;
        } else if (i != 1 || !axxd.a.a().enableDrivingDndExitWithAudioFusion() || this.a != 0) {
            return 1;
        } else {
            Log.w("TransitionAHandler", "Received other fusion result. Exiting Vehicle");
            this.a = 1;
            return 3;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ca, code lost:
        return 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int a(com.google.android.gms.location.ActivityTransitionResult r8, int r9) {
        /*
            r7 = this;
            monitor-enter(r7)
            boolean r0 = defpackage.axxd.e()     // Catch:{ all -> 0x00e6 }
            if (r0 != 0) goto L_0x0008
            goto L_0x001a
        L_0x0008:
            axxd r0 = defpackage.axxd.a     // Catch:{ all -> 0x00e6 }
            axxe r0 = r0.a()     // Catch:{ all -> 0x00e6 }
            boolean r0 = r0.onlyRelyOnCarTransitionStateMachine()     // Catch:{ all -> 0x00e6 }
            if (r0 == 0) goto L_0x001a
            int r8 = r7.a(r9)     // Catch:{ all -> 0x00e6 }
            monitor-exit(r7)
            return r8
        L_0x001a:
            java.util.List r0 = r8.a     // Catch:{ all -> 0x00e6 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x00e6 }
            r1 = 1
            if (r0 != 0) goto L_0x00dd
            java.util.List r0 = r8.a     // Catch:{ all -> 0x00e6 }
            int r0 = r0.size()     // Catch:{ all -> 0x00e6 }
            r2 = 2
            r3 = 0
            if (r0 <= r1) goto L_0x0067
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e6 }
            r0.<init>()     // Catch:{ all -> 0x00e6 }
            java.util.List r4 = r8.a     // Catch:{ all -> 0x00e6 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x00e6 }
        L_0x0038:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x00e6 }
            if (r5 == 0) goto L_0x0048
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x00e6 }
            com.google.android.gms.location.ActivityTransitionEvent r5 = (com.google.android.gms.location.ActivityTransitionEvent) r5     // Catch:{ all -> 0x00e6 }
            r0.append(r5)     // Catch:{ all -> 0x00e6 }
            goto L_0x0038
        L_0x0048:
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ all -> 0x00e6 }
            java.util.List r5 = r8.a     // Catch:{ all -> 0x00e6 }
            int r5 = r5.size()     // Catch:{ all -> 0x00e6 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x00e6 }
            r4[r3] = r5     // Catch:{ all -> 0x00e6 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00e6 }
            r4[r1] = r0     // Catch:{ all -> 0x00e6 }
            java.lang.String r0 = "TransitionAHandler"
            java.lang.String r5 = "TransitionApiHandler received >1 (%d) transition results: %s"
            java.lang.String r4 = java.lang.String.format(r5, r4)     // Catch:{ all -> 0x00e6 }
            android.util.Log.w(r0, r4)     // Catch:{ all -> 0x00e6 }
        L_0x0067:
            java.util.List r0 = r8.a     // Catch:{ all -> 0x00e6 }
            int r4 = r0.size()     // Catch:{ all -> 0x00e6 }
            int r4 = r4 + -1
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x00e6 }
            com.google.android.gms.location.ActivityTransitionEvent r0 = (com.google.android.gms.location.ActivityTransitionEvent) r0     // Catch:{ all -> 0x00e6 }
            axzv r4 = defpackage.axzv.a     // Catch:{ all -> 0x00e6 }
            axzw r4 = r4.a()     // Catch:{ all -> 0x00e6 }
            boolean r4 = r4.enableDndExitOnfoot()     // Catch:{ all -> 0x00e6 }
            r5 = 3
            if (r4 == 0) goto L_0x00a3
            int r4 = r0.a     // Catch:{ all -> 0x00e6 }
            r6 = 8
            if (r4 == r6) goto L_0x008c
            r6 = 7
            if (r4 == r6) goto L_0x008c
        L_0x008b:
            goto L_0x00a3
        L_0x008c:
            int r4 = r0.b     // Catch:{ all -> 0x00e6 }
            if (r4 != 0) goto L_0x008b
            java.lang.Object[] r9 = new java.lang.Object[r1]     // Catch:{ all -> 0x00e6 }
            r9[r3] = r8     // Catch:{ all -> 0x00e6 }
            java.lang.String r8 = "TransitionAHandler"
            java.lang.String r0 = "Received walking/running entry transition. Exiting in vehicle %s"
            java.lang.String r9 = java.lang.String.format(r0, r9)     // Catch:{ all -> 0x00e6 }
            android.util.Log.w(r8, r9)     // Catch:{ all -> 0x00e6 }
            r7.a = r1     // Catch:{ all -> 0x00e6 }
            monitor-exit(r7)
            return r5
        L_0x00a3:
            int r9 = r7.a(r9)     // Catch:{ all -> 0x00e6 }
            if (r9 != r1) goto L_0x00db
            int r9 = r0.a     // Catch:{ all -> 0x00e6 }
            if (r9 != 0) goto L_0x00ae
        L_0x00ad:
            goto L_0x00c3
        L_0x00ae:
            r4 = 16
            if (r9 == r4) goto L_0x00ad
            java.lang.Object[] r9 = new java.lang.Object[r1]     // Catch:{ all -> 0x00e6 }
            r9[r3] = r8     // Catch:{ all -> 0x00e6 }
            java.lang.String r8 = "TransitionAHandler"
            java.lang.String r0 = "Insignificant non vehicle related transition result = %s"
            java.lang.String r9 = java.lang.String.format(r0, r9)     // Catch:{ all -> 0x00e6 }
            android.util.Log.w(r8, r9)     // Catch:{ all -> 0x00e6 }
            monitor-exit(r7)
            return r1
        L_0x00c3:
            int r8 = r0.b     // Catch:{ all -> 0x00e6 }
            if (r8 == 0) goto L_0x00d3
            if (r8 == r1) goto L_0x00cb
        L_0x00c9:
            monitor-exit(r7)
            return r1
        L_0x00cb:
            int r8 = r7.a     // Catch:{ all -> 0x00e6 }
            if (r8 == r1) goto L_0x00c9
            r7.a = r1     // Catch:{ all -> 0x00e6 }
            monitor-exit(r7)
            return r5
        L_0x00d3:
            int r8 = r7.a     // Catch:{ all -> 0x00e6 }
            if (r8 == 0) goto L_0x00c9
            r7.a = r3     // Catch:{ all -> 0x00e6 }
            monitor-exit(r7)
            return r2
        L_0x00db:
            monitor-exit(r7)
            return r9
        L_0x00dd:
            java.lang.String r8 = "TransitionAHandler"
            java.lang.String r9 = "Transition result is empty!"
            android.util.Log.w(r8, r9)     // Catch:{ all -> 0x00e6 }
            monitor-exit(r7)
            return r1
        L_0x00e6:
            r8 = move-exception
            monitor-exit(r7)
            goto L_0x00ea
        L_0x00e9:
            throw r8
        L_0x00ea:
            goto L_0x00e9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahnv.a(com.google.android.gms.location.ActivityTransitionResult, int):int");
    }
}
