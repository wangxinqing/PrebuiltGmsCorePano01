package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.InflateException;
import com.google.android.setupdesign.items.Item;
import java.lang.reflect.Constructor;
import java.util.HashMap;

/* renamed from: alio  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alio extends alip {
    private static final Class[] c = {Context.class, AttributeSet.class};
    private static final HashMap d = new HashMap();
    public final String a;
    private final Object[] e = new Object[2];
    private final Context f;

    /* access modifiers changed from: protected */
    public final Object a(String str, AttributeSet attributeSet) {
        String str2 = this.a;
        String concat = (str2 == null || str.indexOf(46) != -1) ? str : str2.concat(str);
        Constructor<?> constructor = (Constructor) d.get(concat);
        if (constructor == null) {
            try {
                constructor = this.f.getClassLoader().loadClass(concat).getConstructor(c);
                constructor.setAccessible(true);
                d.put(str, constructor);
            } catch (Exception e2) {
                String positionDescription = attributeSet.getPositionDescription();
                StringBuilder sb = new StringBuilder(String.valueOf(positionDescription).length() + 24 + String.valueOf(concat).length());
                sb.append(positionDescription);
                sb.append(": Error inflating class ");
                sb.append(concat);
                throw new InflateException(sb.toString(), e2);
            }
        }
        Object[] objArr = this.e;
        objArr[0] = this.f;
        objArr[1] = attributeSet;
        Object newInstance = constructor.newInstance(objArr);
        Object[] objArr2 = this.e;
        objArr2[0] = null;
        objArr2[1] = null;
        return newInstance;
    }

    public alio(Context context) {
        super(context.getResources());
        this.f = context;
        this.a = String.valueOf(Item.class.getPackage().getName()).concat(".");
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        alih alih = (alih) obj;
        alih alih2 = (alih) obj2;
        if (alih instanceof alii) {
            ((alii) alih).a(alih2);
            return;
        }
        String valueOf = String.valueOf(alih);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
        sb.append("Cannot add child item to ");
        sb.append(valueOf);
        throw new IllegalArgumentException(sb.toString());
    }
}
