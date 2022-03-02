package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;

/* renamed from: gy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class gy implements LayoutInflater.Factory2 {
    private final hl a;

    public gy(hl hlVar) {
        this.a = hlVar;
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        hq hqVar;
        int i;
        if (gu.class.getName().equals(str)) {
            return new gu(context, attributeSet, this.a);
        }
        gj gjVar = null;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue((String) null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, fm.a);
        int i2 = 0;
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (attributeValue == null || !gw.a(context.getClassLoader(), attributeValue)) {
            return null;
        }
        if (view != null) {
            i2 = view.getId();
        }
        if (i2 == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        if (resourceId != -1) {
            gjVar = this.a.b(resourceId);
        }
        if (gjVar == null && string != null) {
            gjVar = this.a.a(string);
        }
        if (gjVar == null && i2 != -1) {
            gjVar = this.a.b(i2);
        }
        if (hl.a(2)) {
            "onCreateView: id=0x" + Integer.toHexString(resourceId) + " fname=" + attributeValue + " existing=" + gjVar;
        }
        if (gjVar == null) {
            gjVar = this.a.p().c(context.getClassLoader(), attributeValue);
            gjVar.y = true;
            if (resourceId != 0) {
                i = resourceId;
            } else {
                i = i2;
            }
            gjVar.H = i;
            gjVar.I = i2;
            gjVar.J = string;
            gjVar.z = true;
            gjVar.D = this.a;
            hl hlVar = this.a;
            gjVar.E = hlVar.k;
            gjVar.onInflate(hlVar.k.c, attributeSet, gjVar.n);
            hqVar = this.a.e(gjVar);
            this.a.f(gjVar);
        } else if (!gjVar.z) {
            gjVar.z = true;
            gjVar.D = this.a;
            hl hlVar2 = this.a;
            gjVar.E = hlVar2.k;
            gjVar.onInflate(hlVar2.k.c, attributeSet, gjVar.n);
            hqVar = this.a.e(gjVar);
        } else {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(i2) + " with another fragment for " + attributeValue);
        }
        hqVar.b();
        hqVar.c();
        View view2 = gjVar.S;
        if (view2 != null) {
            if (resourceId != 0) {
                view2.setId(resourceId);
            }
            if (gjVar.S.getTag() == null) {
                gjVar.S.setTag(string);
            }
            return gjVar.S;
        }
        throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
    }

    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }
}
