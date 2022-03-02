package defpackage;

import com.android.volley.RequestQueue;
import java.util.List;
import java.util.concurrent.ThreadFactory;

/* renamed from: atgt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atgt implements Runnable {
    public static final String a = atgt.class.getSimpleName();
    public final atgp b;
    public final List c;
    public final ThreadFactory d;
    public final String e;
    public final String f;
    private final String g;
    private final RequestQueue h;
    private final String i;
    private final String j;

    public atgt(atgp atgp, List list, String str, RequestQueue requestQueue, String str2, String str3, String str4, String str5, ThreadFactory threadFactory) {
        this.b = atgp;
        this.c = list;
        this.g = str;
        this.h = requestQueue;
        this.i = str2;
        this.e = str3;
        this.f = str4;
        this.j = str5;
        this.d = threadFactory;
    }

    static String a(List list) {
        String[] strArr = new String[list.size()];
        for (int i2 = 0; i2 < list.size(); i2++) {
            strArr[i2] = String.valueOf(((atgo) list.get(i2)).a());
        }
        return atgb.a(strArr, ",");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v19, resolved type: java.io.DataInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v20, resolved type: java.io.DataInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v24, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v25, resolved type: java.io.DataInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v26, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v27, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v28, resolved type: java.io.DataInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v36, resolved type: java.io.DataInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: atgo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v69, resolved type: java.io.DataInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v38, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v39, resolved type: byte[]} */
    /* JADX WARNING: type inference failed for: r1v39 */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x042c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:?, code lost:
        r7.b.a(5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x043f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0440, code lost:
        r7.b.a(4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x044a, code lost:
        r1 = r7.b;
        r1.h();
        r1.r();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01c7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01c8, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01cf, code lost:
        if (defpackage.atfx.a(a, 3) != false) goto L_0x01d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01d1, code lost:
        r1 = java.lang.String.valueOf(r1);
        r3 = new java.lang.StringBuilder(java.lang.String.valueOf(r1).length() + 12);
        r3.append("Closing is: ");
        r3.append(r1);
        r3.toString();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02b0 A[Catch:{ all -> 0x02a2, ExecutionException -> 0x0330, IOException -> 0x032d, all -> 0x0328 }] */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x02d8 A[Catch:{ all -> 0x02a2, ExecutionException -> 0x0330, IOException -> 0x032d, all -> 0x0328 }] */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x02f6 A[Catch:{ all -> 0x02a2, ExecutionException -> 0x0330, IOException -> 0x032d, all -> 0x0328 }] */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0343 A[Catch:{ ExecutionException -> 0x034b, IOException -> 0x0336, all -> 0x0333, all -> 0x036e }] */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x035e A[Catch:{ ExecutionException -> 0x034b, IOException -> 0x0336, all -> 0x0333, all -> 0x036e }] */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0375 A[SYNTHETIC, Splitter:B:158:0x0375] */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x03b2 A[Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }] */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x042c A[ExcHandler: all (r0v4 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:23:0x002d] */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x043f A[Catch:{ IOException -> 0x0379, SecurityException -> 0x0449, atgv -> 0x043f, all -> 0x042c, all -> 0x045f }, ExcHandler: atgv (r0v2 'e' atgv A[CUSTOM_DECLARE, Catch:{  }]), Splitter:B:23:0x002d] */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x0449 A[Catch:{ IOException -> 0x0379, SecurityException -> 0x0449, atgv -> 0x043f, all -> 0x042c, all -> 0x045f }, ExcHandler: SecurityException (e java.lang.SecurityException), Splitter:B:23:0x002d] */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x03a1 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r17 = this;
            r7 = r17
        L_0x0002:
            atgp r1 = r7.b     // Catch:{ all -> 0x045f }
            boolean r1 = r1.g()     // Catch:{ all -> 0x045f }
            if (r1 != 0) goto L_0x000c
        L_0x000a:
            goto L_0x0454
        L_0x000c:
            java.util.List r1 = r7.c     // Catch:{ all -> 0x045f }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x045f }
            if (r1 != 0) goto L_0x000a
            atgp r1 = r7.b     // Catch:{ all -> 0x045f }
            long r1 = r1.j()     // Catch:{ all -> 0x045f }
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 > 0) goto L_0x0021
            goto L_0x002c
        L_0x0021:
            monitor-enter(r17)     // Catch:{ InterruptedException -> 0x002b }
            r7.wait(r1)     // Catch:{ all -> 0x0027 }
            monitor-exit(r17)     // Catch:{ all -> 0x0027 }
            goto L_0x002c
        L_0x0027:
            r0 = move-exception
            r1 = r0
            monitor-exit(r17)     // Catch:{ all -> 0x0027 }
            throw r1     // Catch:{ InterruptedException -> 0x002b }
        L_0x002b:
            r0 = move-exception
        L_0x002c:
            r9 = 3
            java.util.List r1 = r7.c     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            int r10 = r1.size()     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            atgp r1 = r7.b     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            boolean r1 = r1.i()     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            if (r1 == 0) goto L_0x0424
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            r1.<init>()     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            java.io.DataOutputStream r2 = new java.io.DataOutputStream     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            r2.<init>(r1)     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            java.util.List r3 = r7.c     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            boolean r3 = r3.isEmpty()     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            r11 = 0
            if (r3 != 0) goto L_0x0058
            java.util.List r3 = r7.c     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            java.lang.Object r3 = r3.get(r11)     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            boolean r3 = r3 instanceof defpackage.atgm     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            if (r3 != 0) goto L_0x0061
        L_0x0058:
            java.util.List r3 = r7.c     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            atgp r4 = r7.b     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            atgm r4 = r4.b     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            r3.add(r11, r4)     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
        L_0x0061:
            r12 = 23
            r2.writeShort(r12)     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            atgp r3 = r7.b     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            long r3 = r3.l()     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            r2.writeLong(r3)     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            java.lang.String r3 = r7.g     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            r2.writeUTF(r3)     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            java.lang.String r3 = r7.e     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            r2.writeUTF(r3)     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            java.lang.String r3 = r7.f     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            r2.writeUTF(r3)     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            java.lang.String r3 = r7.j     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            r2.writeUTF(r3)     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            java.util.List r3 = r7.c     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
        L_0x0089:
            boolean r4 = r3.hasNext()     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            if (r4 == 0) goto L_0x00a0
            java.lang.Object r4 = r3.next()     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            atgo r4 = (defpackage.atgo) r4     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            int r5 = r4.a()     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            r2.writeByte(r5)     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            r4.a((java.io.DataOutputStream) r2)     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            goto L_0x0089
        L_0x00a0:
            r2.flush()     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            byte[] r13 = r1.toByteArray()     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            atgu r14 = new atgu     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            java.util.List r1 = r7.c     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            r14.<init>(r1)     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            com.android.volley.toolbox.RequestFuture r15 = com.android.volley.toolbox.RequestFuture.newFuture()     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            atgs r6 = new atgs     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            java.lang.String r5 = r7.i     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            r1 = r6
            r2 = r17
            r3 = r13
            r4 = r14
            r8 = r6
            r6 = r15
            r1.<init>(r2, r3, r4, r5, r6)     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            r8.setShouldCache(r11)     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            com.android.volley.RequestQueue r1 = r7.h     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            r1.add(r8)     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            r1 = 0
            java.lang.Object r2 = r15.get()     // Catch:{ ExecutionException -> 0x034b, IOException -> 0x0336, all -> 0x0333 }
            byte[] r2 = (byte[]) r2     // Catch:{ ExecutionException -> 0x034b, IOException -> 0x0336, all -> 0x0333 }
            java.io.DataInputStream r3 = new java.io.DataInputStream     // Catch:{ ExecutionException -> 0x034b, IOException -> 0x0336, all -> 0x0333 }
            java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream     // Catch:{ ExecutionException -> 0x034b, IOException -> 0x0336, all -> 0x0333 }
            r4.<init>(r2)     // Catch:{ ExecutionException -> 0x034b, IOException -> 0x0336, all -> 0x0333 }
            r3.<init>(r4)     // Catch:{ ExecutionException -> 0x034b, IOException -> 0x0336, all -> 0x0333 }
            int r4 = r3.readUnsignedShort()     // Catch:{ ExecutionException -> 0x0330, IOException -> 0x032d, all -> 0x0328 }
            if (r4 != r12) goto L_0x031b
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ ExecutionException -> 0x0330, IOException -> 0x032d, all -> 0x0328 }
            r4.<init>()     // Catch:{ ExecutionException -> 0x0330, IOException -> 0x032d, all -> 0x0328 }
            r5 = 0
        L_0x00e5:
            r6 = 24
            java.util.List r12 = r7.c     // Catch:{ IOException -> 0x02cd, RuntimeException -> 0x02a5 }
            int r12 = r12.size()     // Catch:{ IOException -> 0x02cd, RuntimeException -> 0x02a5 }
            if (r5 >= r12) goto L_0x019e
            java.util.List r12 = r7.c     // Catch:{ IOException -> 0x02cd, RuntimeException -> 0x02a5 }
            java.lang.Object r12 = r12.get(r5)     // Catch:{ IOException -> 0x02cd, RuntimeException -> 0x02a5 }
            atgo r12 = (defpackage.atgo) r12     // Catch:{ IOException -> 0x02cd, RuntimeException -> 0x02a5 }
            atgp r1 = r7.b     // Catch:{ IOException -> 0x0198, RuntimeException -> 0x0192 }
            java.lang.String r8 = a     // Catch:{ IOException -> 0x0198, RuntimeException -> 0x0192 }
            boolean r8 = defpackage.atfx.a(r8, r9)     // Catch:{ IOException -> 0x0198, RuntimeException -> 0x0192 }
            if (r8 == 0) goto L_0x011f
            java.lang.String r8 = java.lang.String.valueOf(r12)     // Catch:{ IOException -> 0x0198, RuntimeException -> 0x0192 }
            java.lang.String r16 = java.lang.String.valueOf(r8)     // Catch:{ IOException -> 0x0198, RuntimeException -> 0x0192 }
            int r16 = r16.length()     // Catch:{ IOException -> 0x0198, RuntimeException -> 0x0192 }
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0198, RuntimeException -> 0x0192 }
            int r11 = r16 + 24
            r15.<init>(r11)     // Catch:{ IOException -> 0x0198, RuntimeException -> 0x0192 }
            java.lang.String r11 = "Processing DataRequest: "
            r15.append(r11)     // Catch:{ IOException -> 0x0198, RuntimeException -> 0x0192 }
            r15.append(r8)     // Catch:{ IOException -> 0x0198, RuntimeException -> 0x0192 }
            r15.toString()     // Catch:{ IOException -> 0x0198, RuntimeException -> 0x0192 }
        L_0x011f:
            int r8 = r3.readUnsignedByte()     // Catch:{ IOException -> 0x0198, RuntimeException -> 0x0192 }
            int r11 = r12.a()     // Catch:{ IOException -> 0x0198, RuntimeException -> 0x0192 }
            if (r8 == r11) goto L_0x016c
            java.lang.String r1 = a     // Catch:{ IOException -> 0x0198, RuntimeException -> 0x0192 }
            boolean r1 = defpackage.atfx.a(r1, r9)     // Catch:{ IOException -> 0x0198, RuntimeException -> 0x0192 }
            if (r1 != 0) goto L_0x0132
            goto L_0x0147
        L_0x0132:
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ IOException -> 0x0198, RuntimeException -> 0x0192 }
            int r2 = r12.a()     // Catch:{ IOException -> 0x0198, RuntimeException -> 0x0192 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ IOException -> 0x0198, RuntimeException -> 0x0192 }
            r11 = 0
            r1[r11] = r2     // Catch:{ IOException -> 0x0198, RuntimeException -> 0x0192 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)     // Catch:{ IOException -> 0x0198, RuntimeException -> 0x0192 }
            r10 = 1
            r1[r10] = r2     // Catch:{ IOException -> 0x0198, RuntimeException -> 0x0192 }
        L_0x0147:
            java.io.IOException r1 = new java.io.IOException     // Catch:{ IOException -> 0x0198, RuntimeException -> 0x0192 }
            int r2 = r12.a()     // Catch:{ IOException -> 0x0198, RuntimeException -> 0x0192 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0198, RuntimeException -> 0x0192 }
            r11 = 39
            r10.<init>(r11)     // Catch:{ IOException -> 0x0198, RuntimeException -> 0x0192 }
            java.lang.String r11 = "RequestType: "
            r10.append(r11)     // Catch:{ IOException -> 0x0198, RuntimeException -> 0x0192 }
            r10.append(r8)     // Catch:{ IOException -> 0x0198, RuntimeException -> 0x0192 }
            java.lang.String r8 = " != "
            r10.append(r8)     // Catch:{ IOException -> 0x0198, RuntimeException -> 0x0192 }
            r10.append(r2)     // Catch:{ IOException -> 0x0198, RuntimeException -> 0x0192 }
            java.lang.String r2 = r10.toString()     // Catch:{ IOException -> 0x0198, RuntimeException -> 0x0192 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x0198, RuntimeException -> 0x0192 }
            throw r1     // Catch:{ IOException -> 0x0198, RuntimeException -> 0x0192 }
        L_0x016c:
            r11 = 0
            boolean r8 = r12.a((java.io.DataInputStream) r3)     // Catch:{ IOException -> 0x0198, RuntimeException -> 0x0192 }
            if (r8 == 0) goto L_0x018a
            java.util.concurrent.CopyOnWriteArrayList r1 = r1.d     // Catch:{ IOException -> 0x0198, RuntimeException -> 0x0192 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ IOException -> 0x0198, RuntimeException -> 0x0192 }
        L_0x0179:
            boolean r8 = r1.hasNext()     // Catch:{ IOException -> 0x0198, RuntimeException -> 0x0192 }
            if (r8 != 0) goto L_0x0180
            goto L_0x018d
        L_0x0180:
            java.lang.Object r8 = r1.next()     // Catch:{ IOException -> 0x0198, RuntimeException -> 0x0192 }
            atgg r8 = (defpackage.atgg) r8     // Catch:{ IOException -> 0x0198, RuntimeException -> 0x0192 }
            r8.b(r12)     // Catch:{ IOException -> 0x0198, RuntimeException -> 0x0192 }
            goto L_0x0179
        L_0x018a:
            r4.add(r12)     // Catch:{ IOException -> 0x0198, RuntimeException -> 0x0192 }
        L_0x018d:
            int r5 = r5 + 1
            r1 = r12
            goto L_0x00e5
        L_0x0192:
            r0 = move-exception
            r1 = r0
            r2 = r1
            r1 = r12
            goto L_0x02a7
        L_0x0198:
            r0 = move-exception
            r1 = r0
            r2 = r1
            r1 = r12
            goto L_0x02cf
        L_0x019e:
            java.util.List r1 = r7.c     // Catch:{ ExecutionException -> 0x0330, IOException -> 0x032d, all -> 0x0328 }
            int r1 = r1.size()     // Catch:{ ExecutionException -> 0x0330, IOException -> 0x032d, all -> 0x0328 }
            if (r5 < r1) goto L_0x01a7
            goto L_0x01b4
        L_0x01a7:
            java.util.List r1 = r7.c     // Catch:{ ExecutionException -> 0x0330, IOException -> 0x032d, all -> 0x0328 }
            int r6 = r1.size()     // Catch:{ ExecutionException -> 0x0330, IOException -> 0x032d, all -> 0x0328 }
            java.util.List r1 = r1.subList(r5, r6)     // Catch:{ ExecutionException -> 0x0330, IOException -> 0x032d, all -> 0x0328 }
            r4.addAll(r1)     // Catch:{ ExecutionException -> 0x0330, IOException -> 0x032d, all -> 0x0328 }
        L_0x01b4:
            java.util.List r1 = r7.c     // Catch:{ ExecutionException -> 0x0330, IOException -> 0x032d, all -> 0x0328 }
            r1.clear()     // Catch:{ ExecutionException -> 0x0330, IOException -> 0x032d, all -> 0x0328 }
            java.util.List r1 = r7.c     // Catch:{ ExecutionException -> 0x0330, IOException -> 0x032d, all -> 0x0328 }
            r1.addAll(r4)     // Catch:{ ExecutionException -> 0x0330, IOException -> 0x032d, all -> 0x0328 }
            int r1 = r13.length     // Catch:{ ExecutionException -> 0x0330, IOException -> 0x032d, all -> 0x0328 }
            int r2 = r2.length     // Catch:{ ExecutionException -> 0x0330, IOException -> 0x032d, all -> 0x0328 }
            r14.a(r1, r2)     // Catch:{ ExecutionException -> 0x0330, IOException -> 0x032d, all -> 0x0328 }
            r3.close()     // Catch:{ IOException -> 0x01c7, SecurityException -> 0x0449, atgv -> 0x043f, all -> 0x042c }
            goto L_0x01ef
        L_0x01c7:
            r0 = move-exception
            r1 = r0
            java.lang.String r2 = a     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            boolean r2 = defpackage.atfx.a(r2, r9)     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            if (r2 == 0) goto L_0x01ef
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            int r2 = r2.length()     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            int r2 = r2 + 12
            r3.<init>(r2)     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            java.lang.String r2 = "Closing is: "
            r3.append(r2)     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            r3.append(r1)     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            r3.toString()     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
        L_0x01ef:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            r1.<init>()     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            java.util.List r2 = r7.c     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
        L_0x01fa:
            boolean r3 = r2.hasNext()     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            if (r3 != 0) goto L_0x0238
            java.util.List r2 = r7.c     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            r2.clear()     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            java.util.List r2 = r7.c     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            r2.addAll(r1)     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            java.util.List r1 = r7.c     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            int r1 = r1.size()     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            if (r1 == r10) goto L_0x0219
            atgp r1 = r7.b     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            r1.k()     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            goto L_0x0002
        L_0x0219:
            java.io.IOException r1 = new java.io.IOException     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            java.util.List r2 = r7.c     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            int r2 = r2.size()     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            r4 = 39
            r3.<init>(r4)     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            java.lang.String r4 = "No requests were processed: "
            r3.append(r4)     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            r3.append(r2)     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            java.lang.String r2 = r3.toString()     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            r1.<init>(r2)     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            throw r1     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
        L_0x0238:
            r4 = 39
            java.lang.Object r3 = r2.next()     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            atgo r3 = (defpackage.atgo) r3     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            boolean r5 = r3.d()     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            if (r5 != 0) goto L_0x0277
            java.lang.String r5 = a     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            boolean r5 = defpackage.atfx.a(r5, r9)     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            if (r5 == 0) goto L_0x0271
            java.lang.String r5 = java.lang.String.valueOf(r3)     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            java.lang.String r6 = java.lang.String.valueOf(r5)     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            int r6 = r6.length()     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            int r6 = r6 + 31
            r8.<init>(r6)     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            java.lang.String r6 = "Error processing: "
            r8.append(r6)     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            r8.append(r5)     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            java.lang.String r5 = " not retrying"
            r8.append(r5)     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            r8.toString()     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
        L_0x0271:
            atgp r5 = r7.b     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            r5.b(r3)     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            goto L_0x01fa
        L_0x0277:
            java.lang.String r5 = a     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            boolean r5 = defpackage.atfx.a(r5, r9)     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            if (r5 == 0) goto L_0x029d
            java.lang.String r5 = java.lang.String.valueOf(r3)     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            java.lang.String r6 = java.lang.String.valueOf(r5)     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            int r6 = r6.length()     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            int r6 = r6 + 10
            r8.<init>(r6)     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            java.lang.String r6 = "Retrying: "
            r8.append(r6)     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            r8.append(r5)     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            r8.toString()     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
        L_0x029d:
            r1.add(r3)     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            goto L_0x01fa
        L_0x02a2:
            r0 = move-exception
            r1 = r0
            goto L_0x02fa
        L_0x02a5:
            r0 = move-exception
            r2 = r0
        L_0x02a7:
            java.lang.String r6 = a     // Catch:{ all -> 0x02a2 }
            r8 = 6
            boolean r6 = defpackage.atfx.a(r6, r8)     // Catch:{ all -> 0x02a2 }
            if (r6 == 0) goto L_0x02cc
            java.lang.String r6 = a     // Catch:{ all -> 0x02a2 }
            int r1 = r1.a()     // Catch:{ all -> 0x02a2 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x02a2 }
            r10 = 29
            r8.<init>(r10)     // Catch:{ all -> 0x02a2 }
            java.lang.String r10 = "RunTimeException: "
            r8.append(r10)     // Catch:{ all -> 0x02a2 }
            r8.append(r1)     // Catch:{ all -> 0x02a2 }
            java.lang.String r1 = r8.toString()     // Catch:{ all -> 0x02a2 }
            android.util.Log.e(r6, r1)     // Catch:{ all -> 0x02a2 }
        L_0x02cc:
            throw r2     // Catch:{ all -> 0x02a2 }
        L_0x02cd:
            r0 = move-exception
            r2 = r0
        L_0x02cf:
            java.lang.String r8 = a     // Catch:{ all -> 0x02a2 }
            r10 = 6
            boolean r8 = defpackage.atfx.a(r8, r10)     // Catch:{ all -> 0x02a2 }
            if (r8 == 0) goto L_0x02f2
            java.lang.String r8 = a     // Catch:{ all -> 0x02a2 }
            int r10 = r1.a()     // Catch:{ all -> 0x02a2 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x02a2 }
            r11.<init>(r6)     // Catch:{ all -> 0x02a2 }
            java.lang.String r6 = "IOException: "
            r11.append(r6)     // Catch:{ all -> 0x02a2 }
            r11.append(r10)     // Catch:{ all -> 0x02a2 }
            java.lang.String r6 = r11.toString()     // Catch:{ all -> 0x02a2 }
            android.util.Log.e(r8, r6)     // Catch:{ all -> 0x02a2 }
        L_0x02f2:
            boolean r6 = r2 instanceof java.io.EOFException     // Catch:{ all -> 0x02a2 }
            if (r6 == 0) goto L_0x02f9
            r1.e()     // Catch:{ all -> 0x02a2 }
        L_0x02f9:
            throw r2     // Catch:{ all -> 0x02a2 }
        L_0x02fa:
            java.util.List r2 = r7.c     // Catch:{ ExecutionException -> 0x0330, IOException -> 0x032d, all -> 0x0328 }
            int r2 = r2.size()     // Catch:{ ExecutionException -> 0x0330, IOException -> 0x032d, all -> 0x0328 }
            if (r5 < r2) goto L_0x0303
            goto L_0x0310
        L_0x0303:
            java.util.List r2 = r7.c     // Catch:{ ExecutionException -> 0x0330, IOException -> 0x032d, all -> 0x0328 }
            int r6 = r2.size()     // Catch:{ ExecutionException -> 0x0330, IOException -> 0x032d, all -> 0x0328 }
            java.util.List r2 = r2.subList(r5, r6)     // Catch:{ ExecutionException -> 0x0330, IOException -> 0x032d, all -> 0x0328 }
            r4.addAll(r2)     // Catch:{ ExecutionException -> 0x0330, IOException -> 0x032d, all -> 0x0328 }
        L_0x0310:
            java.util.List r2 = r7.c     // Catch:{ ExecutionException -> 0x0330, IOException -> 0x032d, all -> 0x0328 }
            r2.clear()     // Catch:{ ExecutionException -> 0x0330, IOException -> 0x032d, all -> 0x0328 }
            java.util.List r2 = r7.c     // Catch:{ ExecutionException -> 0x0330, IOException -> 0x032d, all -> 0x0328 }
            r2.addAll(r4)     // Catch:{ ExecutionException -> 0x0330, IOException -> 0x032d, all -> 0x0328 }
            throw r1     // Catch:{ ExecutionException -> 0x0330, IOException -> 0x032d, all -> 0x0328 }
        L_0x031b:
            atgp r1 = r7.b     // Catch:{ ExecutionException -> 0x0330, IOException -> 0x032d, all -> 0x0328 }
            r1.r()     // Catch:{ ExecutionException -> 0x0330, IOException -> 0x032d, all -> 0x0328 }
            java.io.IOException r1 = new java.io.IOException     // Catch:{ ExecutionException -> 0x0330, IOException -> 0x032d, all -> 0x0328 }
            java.lang.String r2 = "Protocol version mismatch with the server"
            r1.<init>(r2)     // Catch:{ ExecutionException -> 0x0330, IOException -> 0x032d, all -> 0x0328 }
            throw r1     // Catch:{ ExecutionException -> 0x0330, IOException -> 0x032d, all -> 0x0328 }
        L_0x0328:
            r0 = move-exception
            r1 = r0
            r2 = r1
            r1 = r3
            goto L_0x0372
        L_0x032d:
            r0 = move-exception
            r1 = r0
            goto L_0x033a
        L_0x0330:
            r0 = move-exception
            r1 = r0
            goto L_0x034f
        L_0x0333:
            r0 = move-exception
            r2 = r0
            goto L_0x0372
        L_0x0336:
            r0 = move-exception
            r2 = r0
            r3 = r1
            r1 = r2
        L_0x033a:
            java.lang.String r2 = a     // Catch:{ all -> 0x036e }
            r4 = 5
            boolean r2 = defpackage.atfx.a(r2, r4)     // Catch:{ all -> 0x036e }
            if (r2 == 0) goto L_0x034a
            java.lang.String r2 = a     // Catch:{ all -> 0x036e }
            java.lang.String r4 = "Exception when processing the responses"
            android.util.Log.w(r2, r4, r1)     // Catch:{ all -> 0x036e }
        L_0x034a:
            throw r1     // Catch:{ all -> 0x036e }
        L_0x034b:
            r0 = move-exception
            r2 = r0
            r3 = r1
            r1 = r2
        L_0x034f:
            java.lang.Throwable r1 = r1.getCause()     // Catch:{ all -> 0x036e }
            com.android.volley.VolleyError r1 = (com.android.volley.VolleyError) r1     // Catch:{ all -> 0x036e }
            java.lang.String r2 = a     // Catch:{ all -> 0x036e }
            r4 = 5
            boolean r2 = defpackage.atfx.a(r2, r4)     // Catch:{ all -> 0x036e }
            if (r2 == 0) goto L_0x0369
            java.lang.String r2 = a     // Catch:{ all -> 0x036e }
            java.lang.String r4 = "Exception when executing the requests"
            java.lang.Throwable r5 = r1.getCause()     // Catch:{ all -> 0x036e }
            android.util.Log.w(r2, r4, r5)     // Catch:{ all -> 0x036e }
        L_0x0369:
            java.lang.Throwable r1 = r1.getCause()     // Catch:{ all -> 0x036e }
            throw r1     // Catch:{ all -> 0x036e }
        L_0x036e:
            r0 = move-exception
            r1 = r0
            r2 = r1
            r1 = r3
        L_0x0372:
            if (r1 != 0) goto L_0x0375
            goto L_0x03a1
        L_0x0375:
            r1.close()     // Catch:{ IOException -> 0x0379, SecurityException -> 0x0449, atgv -> 0x043f, all -> 0x042c }
            goto L_0x03a1
        L_0x0379:
            r0 = move-exception
            r1 = r0
            java.lang.String r3 = a     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            boolean r3 = defpackage.atfx.a(r3, r9)     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            if (r3 == 0) goto L_0x03a1
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            java.lang.String r3 = java.lang.String.valueOf(r1)     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            int r3 = r3.length()     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            int r3 = r3 + 12
            r4.<init>(r3)     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            java.lang.String r3 = "Closing is: "
            r4.append(r3)     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            r4.append(r1)     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            r4.toString()     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
        L_0x03a1:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            r1.<init>()     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            java.util.List r3 = r7.c     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
        L_0x03ac:
            boolean r4 = r3.hasNext()     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            if (r4 == 0) goto L_0x0419
            java.lang.Object r4 = r3.next()     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            atgo r4 = (defpackage.atgo) r4     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            boolean r5 = r4.d()     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            if (r5 != 0) goto L_0x03ef
            java.lang.String r5 = a     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            boolean r5 = defpackage.atfx.a(r5, r9)     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            if (r5 == 0) goto L_0x03e9
            java.lang.String r5 = java.lang.String.valueOf(r4)     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            java.lang.String r6 = java.lang.String.valueOf(r5)     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            int r6 = r6.length()     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            int r6 = r6 + 31
            r8.<init>(r6)     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            java.lang.String r6 = "Error processing: "
            r8.append(r6)     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            r8.append(r5)     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            java.lang.String r5 = " not retrying"
            r8.append(r5)     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            r8.toString()     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
        L_0x03e9:
            atgp r5 = r7.b     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            r5.b(r4)     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            goto L_0x03ac
        L_0x03ef:
            java.lang.String r5 = a     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            boolean r5 = defpackage.atfx.a(r5, r9)     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            if (r5 == 0) goto L_0x0415
            java.lang.String r5 = java.lang.String.valueOf(r4)     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            java.lang.String r6 = java.lang.String.valueOf(r5)     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            int r6 = r6.length()     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            int r6 = r6 + 10
            r8.<init>(r6)     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            java.lang.String r6 = "Retrying: "
            r8.append(r6)     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            r8.append(r5)     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            r8.toString()     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
        L_0x0415:
            r1.add(r4)     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            goto L_0x03ac
        L_0x0419:
            java.util.List r3 = r7.c     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            r3.clear()     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            java.util.List r3 = r7.c     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            r3.addAll(r1)     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            throw r2     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
        L_0x0424:
            java.io.IOException r1 = new java.io.IOException     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            java.lang.String r2 = "DataRequestDispatcher network disabled."
            r1.<init>(r2)     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
            throw r1     // Catch:{ SecurityException -> 0x0449, atgv -> 0x043f, IOException -> 0x0436, all -> 0x042c }
        L_0x042c:
            r0 = move-exception
            r1 = r0
            atgp r2 = r7.b     // Catch:{ all -> 0x045f }
            r3 = 5
            r2.a(r3, r1)     // Catch:{ all -> 0x045f }
            goto L_0x0002
        L_0x0436:
            r0 = move-exception
            r1 = r0
            atgp r2 = r7.b     // Catch:{ all -> 0x045f }
            r2.a(r9, r1)     // Catch:{ all -> 0x045f }
            goto L_0x0002
        L_0x043f:
            r0 = move-exception
            r1 = r0
            atgp r2 = r7.b     // Catch:{ all -> 0x045f }
            r3 = 4
            r2.a(r3, r1)     // Catch:{ all -> 0x045f }
            goto L_0x0002
        L_0x0449:
            r0 = move-exception
            atgp r1 = r7.b     // Catch:{ all -> 0x045f }
            r1.h()     // Catch:{ all -> 0x045f }
            r1.r()     // Catch:{ all -> 0x045f }
            goto L_0x0002
        L_0x0454:
            atgp r1 = r7.b
            r1.b()
            atgp r1 = r7.b
            r1.d()
            return
        L_0x045f:
            r0 = move-exception
            r1 = r0
            atgp r2 = r7.b
            r2.b()
            atgp r2 = r7.b
            r2.d()
            goto L_0x046d
        L_0x046c:
            throw r1
        L_0x046d:
            goto L_0x046c
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atgt.run():void");
    }
}
