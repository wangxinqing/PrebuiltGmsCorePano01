package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: arr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arr {
    static final ArrayList a = new ArrayList();
    private static final arn b = new aru((byte[]) null);
    private static final ThreadLocal c = new ThreadLocal();

    static nz a() {
        nz nzVar;
        WeakReference weakReference = (WeakReference) c.get();
        if (weakReference != null && (nzVar = (nz) weakReference.get()) != null) {
            return nzVar;
        }
        nz nzVar2 = new nz();
        c.set(new WeakReference(nzVar2));
        return nzVar2;
    }

    public static void a(ViewGroup viewGroup, arn arn) {
        if (!a.contains(viewGroup) && qb.A(viewGroup)) {
            a.add(viewGroup);
            if (arn == null) {
                arn = b;
            }
            arn g = arn.clone();
            ArrayList arrayList = (ArrayList) a().get(viewGroup);
            if (arrayList != null && arrayList.size() > 0) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((arn) arrayList.get(i)).b((View) viewGroup);
                }
            }
            if (g != null) {
                g.a(viewGroup, true);
            }
            if (((arh) viewGroup.getTag(R.id.transition_current_scene)) == null) {
                viewGroup.setTag(R.id.transition_current_scene, (Object) null);
                if (g != null) {
                    arq arq = new arq(g, viewGroup);
                    viewGroup.addOnAttachStateChangeListener(arq);
                    viewGroup.getViewTreeObserver().addOnPreDrawListener(arq);
                    return;
                }
                return;
            }
            throw null;
        }
    }
}
