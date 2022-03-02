package defpackage;

import java.nio.ByteBuffer;

/* renamed from: akqa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akqa extends akko {
    public final /* bridge */ /* synthetic */ int a(Object obj) {
        return ((String) obj).length() + 4;
    }

    public final /* bridge */ /* synthetic */ int b(Object obj) {
        akrb akrb = (akrb) obj;
        return 24;
    }

    public final /* bridge */ /* synthetic */ Object b(aubc aubc) {
        ByteBuffer wrap = ByteBuffer.wrap(aubc.e(aubc.h()));
        return akrb.a(wrap.getDouble(), wrap.getDouble(), wrap.getFloat());
    }

    public final /* bridge */ /* synthetic */ Object a(aubc aubc) {
        return new String(aubc.e(aubc.h()), "UTF-8");
    }

    public final /* bridge */ /* synthetic */ void a(Object obj, aubk aubk) {
        byte[] bytes = ((String) obj).getBytes("UTF-8");
        aubk.e(bytes.length);
        aubk.b(bytes);
    }

    public final /* bridge */ /* synthetic */ void b(Object obj, aubk aubk) {
        akrb akrb = (akrb) obj;
        ByteBuffer allocate = ByteBuffer.allocate(20);
        allocate.putDouble(akrb.a);
        allocate.putDouble(akrb.b);
        allocate.putFloat(akrb.c);
        byte[] array = allocate.array();
        aubk.e(array.length);
        aubk.b(array);
    }
}
