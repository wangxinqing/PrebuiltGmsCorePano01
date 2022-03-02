package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* renamed from: are  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class are extends il {
    private static boolean a(arn arn) {
        return !il.a((List) arn.d) || !il.a((List) null) || !il.a((List) null);
    }

    public final Object b(Object obj) {
        if (obj != null) {
            return ((arn) obj).clone();
        }
        return null;
    }

    public final Object c(Object obj) {
        if (obj == null) {
            return null;
        }
        aru aru = new aru();
        aru.a((arn) obj);
        return aru;
    }

    public final Object a(Object obj, Object obj2, Object obj3) {
        aru aru = new aru();
        if (obj != null) {
            aru.a((arn) obj);
        }
        if (obj2 != null) {
            aru.a((arn) obj2);
        }
        if (obj3 != null) {
            aru.a((arn) obj3);
        }
        return aru;
    }

    public final Object b(Object obj, Object obj2, Object obj3) {
        arn arn = (arn) obj3;
        aru aru = new aru();
        aru.a((arn) obj);
        aru.a((arn) obj2);
        aru.b(1);
        if (arn == null) {
            return aru;
        }
        aru aru2 = new aru();
        aru2.a((arn) aru);
        aru2.a(arn);
        return aru2;
    }

    public final void c(Object obj, View view) {
        ((arn) obj).e(view);
    }

    public final void a(ViewGroup viewGroup, Object obj) {
        arr.a(viewGroup, (arn) obj);
    }

    public final void a(Object obj, Rect rect) {
        if (obj != null) {
            ((arn) obj).a(new arl());
        }
    }

    public final void b(Object obj, View view) {
        if (obj != null) {
            ((arn) obj).d(view);
        }
    }

    public final void b(Object obj, View view, ArrayList arrayList) {
        ((arn) obj).a((arm) new ara(view, arrayList));
    }

    public final void a(Object obj, View view) {
        if (view != null) {
            il.a(view, new Rect());
            ((arn) obj).a(new arl());
        }
    }

    public final void b(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        arn arn = (arn) obj;
        int i2 = 0;
        if (arn instanceof aru) {
            aru aru = (aru) arn;
            int i3 = aru.i();
            while (i2 < i3) {
                b((Object) aru.a(i2), arrayList, arrayList2);
                i2++;
            }
        } else if (!a(arn)) {
            ArrayList arrayList3 = arn.e;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                if (arrayList2 != null) {
                    i = arrayList2.size();
                } else {
                    i = 0;
                }
                while (i2 < i) {
                    arn.d((View) arrayList2.get(i2));
                    i2++;
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    arn.e((View) arrayList.get(size));
                }
            }
        }
    }

    public final void a(Object obj, View view, ArrayList arrayList) {
        aru aru = (aru) obj;
        ArrayList arrayList2 = aru.e;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            il.a((List) arrayList2, (View) arrayList.get(i));
        }
        arrayList2.add(view);
        arrayList.add(view);
        a((Object) aru, arrayList);
    }

    public final void a(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3) {
        ((arn) obj).a((arm) new arb(this, obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    public final void a(Object obj, ArrayList arrayList) {
        arn arn = (arn) obj;
        if (arn != null) {
            int i = 0;
            if (arn instanceof aru) {
                aru aru = (aru) arn;
                int i2 = aru.i();
                while (i < i2) {
                    a((Object) aru.a(i), arrayList);
                    i++;
                }
            } else if (!a(arn) && il.a((List) arn.e)) {
                int size = arrayList.size();
                while (i < size) {
                    arn.d((View) arrayList.get(i));
                    i++;
                }
            }
        }
    }

    public final void a(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        aru aru = (aru) obj;
        if (aru != null) {
            aru.e.clear();
            aru.e.addAll(arrayList2);
            b((Object) aru, arrayList, arrayList2);
        }
    }

    public final void a(Object obj, mo moVar, Runnable runnable) {
        arn arn = (arn) obj;
        moVar.a(new arc(arn));
        arn.a((arm) new ard(runnable));
    }

    public final boolean a(Object obj) {
        return obj instanceof arn;
    }
}
