package com.android.volley;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class NetworkResponse {
    public final List allHeaders;
    public final byte[] data;
    public final Map headers;
    public final long networkTimeMs;
    public final boolean notModified;
    public final int statusCode;

    private NetworkResponse(int i, byte[] bArr, Map map, List list, boolean z, long j) {
        this.statusCode = i;
        this.data = bArr;
        this.headers = map;
        this.allHeaders = list != null ? Collections.unmodifiableList(list) : null;
        this.notModified = z;
        this.networkTimeMs = j;
    }

    @Deprecated
    public NetworkResponse(int i, byte[] bArr, Map map, boolean z) {
        this(i, bArr, map, z, 0);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public NetworkResponse(int r10, byte[] r11, java.util.Map r12, boolean r13, long r14) {
        /*
            r9 = this;
            if (r12 == 0) goto L_0x0042
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto L_0x000e
            java.util.List r0 = java.util.Collections.emptyList()
            r5 = r0
            goto L_0x0044
        L_0x000e:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r12.size()
            r0.<init>(r1)
            java.util.Set r1 = r12.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x001f:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0040
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            com.android.volley.Header r3 = new com.android.volley.Header
            java.lang.Object r4 = r2.getKey()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = (java.lang.String) r2
            r3.<init>(r4, r2)
            r0.add(r3)
            goto L_0x001f
        L_0x0040:
            r5 = r0
            goto L_0x0044
        L_0x0042:
            r0 = 0
            r5 = r0
        L_0x0044:
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r6 = r13
            r7 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.volley.NetworkResponse.<init>(int, byte[], java.util.Map, boolean, long):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public NetworkResponse(int r10, byte[] r11, boolean r12, long r13, java.util.List r15) {
        /*
            r9 = this;
            if (r15 == 0) goto L_0x0033
            boolean r0 = r15.isEmpty()
            if (r0 == 0) goto L_0x000e
            java.util.Map r0 = java.util.Collections.emptyMap()
            r4 = r0
            goto L_0x0035
        L_0x000e:
            java.util.TreeMap r0 = new java.util.TreeMap
            java.util.Comparator r1 = java.lang.String.CASE_INSENSITIVE_ORDER
            r0.<init>(r1)
            java.util.Iterator r1 = r15.iterator()
        L_0x0019:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0031
            java.lang.Object r2 = r1.next()
            com.android.volley.Header r2 = (com.android.volley.Header) r2
            java.lang.String r3 = r2.getName()
            java.lang.String r2 = r2.getValue()
            r0.put(r3, r2)
            goto L_0x0019
        L_0x0031:
            r4 = r0
            goto L_0x0035
        L_0x0033:
            r0 = 0
            r4 = r0
        L_0x0035:
            r1 = r9
            r2 = r10
            r3 = r11
            r5 = r15
            r6 = r12
            r7 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.volley.NetworkResponse.<init>(int, byte[], boolean, long, java.util.List):void");
    }

    public NetworkResponse(byte[] bArr) {
        this(200, bArr, false, 0, Collections.emptyList());
    }

    @Deprecated
    public NetworkResponse(byte[] bArr, Map map) {
        this(200, bArr, map, false, 0);
    }
}
