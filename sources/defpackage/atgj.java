package defpackage;

import android.graphics.Bitmap;
import com.android.volley.Response;

/* renamed from: atgj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atgj extends oi {
    public atgj(int i) {
        super(i);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ int b(Object obj, Object obj2) {
        String str = (String) obj;
        Object obj3 = ((Response) obj2).result;
        if (obj3 instanceof Bitmap) {
            Bitmap bitmap = (Bitmap) obj3;
            return bitmap.getRowBytes() * bitmap.getHeight();
        } else if (obj3 instanceof String) {
            return ((String) obj3).getBytes().length;
        } else {
            if (obj3 instanceof byte[]) {
                return ((byte[]) obj3).length;
            }
            String valueOf = String.valueOf(obj3);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 52);
            sb.append("LruCache does not have a sizeOf implementation for: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
    }
}
