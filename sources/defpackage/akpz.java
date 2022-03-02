package defpackage;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: akpz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akpz extends akko {
    public final /* bridge */ /* synthetic */ int a(Object obj) {
        return ((akqm) obj).a() + 4;
    }

    public final /* bridge */ /* synthetic */ int b(Object obj) {
        List<String> list = (List) obj;
        int i = 0;
        for (String length : list) {
            i += length.length();
        }
        if (!list.isEmpty()) {
            i += list.size() - 1;
        }
        return i + 4;
    }

    public final /* bridge */ /* synthetic */ Object a(aubc aubc) {
        try {
            ByteBuffer wrap = ByteBuffer.wrap(aubc.e(aubc.h()));
            int i = wrap.getInt();
            byte[] bArr = new byte[i];
            for (int i2 = 0; i2 < i; i2++) {
                bArr[i2] = wrap.get();
            }
            String str = new String(bArr, "UTF-8");
            int i3 = wrap.getInt();
            byte[] bArr2 = new byte[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                bArr2[i4] = wrap.get();
            }
            return akqm.a(str, new String(bArr2, "UTF-8"), Long.valueOf(wrap.getLong()));
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError("UTF-8 is unknown");
        }
    }

    public final /* bridge */ /* synthetic */ Object b(aubc aubc) {
        byte[] e = aubc.e(aubc.h());
        if (e.length == 0) {
            return Collections.emptyList();
        }
        try {
            return Arrays.asList(new String(e, "UTF-8").split("#"));
        } catch (UnsupportedEncodingException e2) {
            throw new AssertionError("UTF-8 is unknown");
        }
    }

    public final /* bridge */ /* synthetic */ void b(Object obj, aubk aubk) {
        byte[] bArr;
        List<String> list = (List) obj;
        try {
            if (!list.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                for (String append : list) {
                    sb.append(append);
                    sb.append('#');
                }
                sb.deleteCharAt(sb.length() - 1);
                bArr = sb.toString().getBytes("UTF-8");
            } else {
                bArr = new byte[0];
            }
            aubk.e(bArr.length);
            aubk.b(bArr);
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError("UTF-8 is unknown");
        }
    }

    public final /* bridge */ /* synthetic */ void a(Object obj, aubk aubk) {
        akqm akqm = (akqm) obj;
        try {
            ByteBuffer allocate = ByteBuffer.allocate(akqm.a());
            allocate.putInt(akqm.a.length());
            allocate.put(akqm.a.getBytes("UTF-8"));
            allocate.putInt(akqm.b.length());
            allocate.put(akqm.b.getBytes("UTF-8"));
            allocate.putLong(akqm.c);
            byte[] array = allocate.array();
            aubk.e(array.length);
            aubk.b(array);
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError("UTF-8 is unknown");
        }
    }
}
