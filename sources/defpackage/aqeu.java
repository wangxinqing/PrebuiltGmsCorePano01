package defpackage;

import java.util.Arrays;
import java.util.HashMap;

/* renamed from: aqeu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqeu {
    public Object[] a;
    public HashMap b;
    public int c;
    public int d;
    public int e;

    public aqeu() {
        this(128);
    }

    public final aqet a() {
        return new aqet(this);
    }

    public final int b() {
        HashMap hashMap = this.b;
        return hashMap != null ? this.e + hashMap.size() : this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof aqeu)) {
            aqeu aqeu = (aqeu) obj;
            if (b() == aqeu.b()) {
                Object[] objArr = this.a;
                Object[] objArr2 = aqeu.a;
                int min = Math.min(objArr.length, objArr2.length);
                int i = 0;
                while (true) {
                    if (i < min) {
                        Object obj2 = objArr[i];
                        if ((obj2 == null && objArr2[i] != null) || (obj2 != null && !obj2.equals(objArr2[i]))) {
                            break;
                        }
                        i++;
                    } else {
                        int length = objArr.length;
                        int length2 = objArr2.length;
                        if (length > length2) {
                            while (true) {
                                if (min < objArr.length) {
                                    if (objArr[min] != null) {
                                        break;
                                    }
                                    min++;
                                } else {
                                    break;
                                }
                            }
                        } else if (length < length2) {
                            while (true) {
                                if (min < objArr2.length) {
                                    if (objArr2[min] != null) {
                                        break;
                                    }
                                    min++;
                                } else {
                                    break;
                                }
                            }
                        }
                        HashMap hashMap = this.b;
                        if (hashMap == null ? aqeu.b == null : hashMap.equals(aqeu.b)) {
                            return true;
                        }
                    }
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1;
        int i2 = 0;
        while (true) {
            Object[] objArr = this.a;
            if (i2 >= objArr.length) {
                break;
            }
            Object obj = objArr[i2];
            if (obj != null) {
                i = (i * 31) + obj.hashCode() + i2;
            }
            i2++;
        }
        HashMap hashMap = this.b;
        return hashMap != null ? i + hashMap.hashCode() : i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntMap{lower:");
        int i = 0;
        while (true) {
            Object[] objArr = this.a;
            if (i < objArr.length) {
                if (objArr[i] != null) {
                    sb.append(i);
                    sb.append("=>");
                    sb.append(this.a[i]);
                    sb.append(", ");
                }
                i++;
            } else {
                String valueOf = String.valueOf(this.b);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 10);
                sb2.append(", higher:");
                sb2.append(valueOf);
                sb2.append("}");
                sb.append(sb2.toString());
                return sb.toString();
            }
        }
    }

    public aqeu(int i) {
        int i2;
        if (i > 0) {
            i2 = Math.min(i, 128);
        } else {
            i2 = 1;
        }
        this.a = new Object[i2];
        this.e = 0;
        this.d = Integer.MIN_VALUE;
        this.c = Integer.MIN_VALUE;
    }

    public final Object a(int i) {
        HashMap hashMap;
        if (i <= this.c && i >= 0) {
            return this.a[i];
        }
        if (i > this.d || (hashMap = this.b) == null) {
            return null;
        }
        return hashMap.get(Integer.valueOf(i));
    }

    public final void b(int i) {
        if (i >= 0) {
            Object[] objArr = this.a;
            if (i < objArr.length) {
                if (objArr[i] != null) {
                    this.e--;
                }
                objArr[i] = null;
                return;
            }
        }
        HashMap hashMap = this.b;
        if (hashMap != null) {
            hashMap.remove(Integer.valueOf(i));
        }
    }

    public final void a(int i, Object obj) {
        if (obj != null) {
            if (i > this.d) {
                this.d = i;
            }
            if (i < 0 || i >= 128) {
                if (this.b == null) {
                    this.b = new HashMap();
                }
                this.b.put(Integer.valueOf(i), obj);
                return;
            }
            Object[] objArr = this.a;
            int length = objArr.length;
            if (i < length) {
                if (i > this.c) {
                    this.c = i;
                }
                if (objArr[i] == null) {
                    this.e++;
                }
                objArr[i] = obj;
                return;
            }
            do {
                length += length;
            } while (length <= i);
            Object[] objArr2 = new Object[Math.min(Math.max(length, 16), 128)];
            objArr2[i] = obj;
            this.c = i;
            this.e++;
            Object[] objArr3 = this.a;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            Arrays.fill(this.a, (Object) null);
            this.a = objArr2;
            return;
        }
        b(i);
    }
}
