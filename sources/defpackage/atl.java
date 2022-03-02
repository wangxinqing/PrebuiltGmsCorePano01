package defpackage;

import android.os.IBinder;
import android.os.Parcelable;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* renamed from: atl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class atl {
    final ou a;
    final ou b;
    final ou c;

    public atl(ou ouVar, ou ouVar2, ou ouVar3) {
        this.a = ouVar;
        this.b = ouVar2;
        this.c = ouVar3;
    }

    private final Class a(Class cls) {
        Class cls2 = (Class) this.c.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", new Object[]{cls.getPackage().getName(), cls.getSimpleName()}), false, cls.getClassLoader());
        this.c.put(cls.getName(), cls3);
        return cls3;
    }

    /* access modifiers changed from: protected */
    public abstract void a(int i);

    public abstract void a(long j);

    /* access modifiers changed from: protected */
    public abstract void a(IBinder iBinder);

    /* access modifiers changed from: protected */
    public abstract void a(Parcelable parcelable);

    /* access modifiers changed from: protected */
    public abstract void a(CharSequence charSequence);

    /* access modifiers changed from: protected */
    public abstract void a(String str);

    /* access modifiers changed from: protected */
    public abstract void a(boolean z);

    public void a(boolean z, boolean z2) {
    }

    public abstract void a(byte[] bArr);

    public boolean a() {
        return false;
    }

    public final int b(int i, int i2) {
        return b(i2) ? d() : i;
    }

    /* access modifiers changed from: protected */
    public abstract void b();

    public abstract boolean b(int i);

    /* access modifiers changed from: protected */
    public abstract atl c();

    public abstract void c(int i);

    /* access modifiers changed from: protected */
    public abstract int d();

    public abstract long e();

    /* access modifiers changed from: protected */
    public abstract String f();

    /* access modifiers changed from: protected */
    public abstract IBinder g();

    public abstract byte[] h();

    /* access modifiers changed from: protected */
    public abstract CharSequence i();

    /* access modifiers changed from: protected */
    public abstract Parcelable j();

    /* access modifiers changed from: protected */
    public abstract boolean k();

    public final atq l() {
        Class<atl> cls = atl.class;
        String f = f();
        if (f == null) {
            return null;
        }
        atl c2 = c();
        try {
            Method method = (Method) this.a.get(f);
            if (method == null) {
                method = Class.forName(f, true, cls.getClassLoader()).getDeclaredMethod("read", new Class[]{cls});
                this.a.put(f, method);
            }
            return (atq) method.invoke((Object) null, new Object[]{c2});
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException(e2);
            }
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException(e3);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException(e4);
        }
    }

    public final void a(int i, int i2) {
        c(i2);
        a(i);
    }

    public final Parcelable b(Parcelable parcelable, int i) {
        return b(i) ? j() : parcelable;
    }

    public final void a(Parcelable parcelable, int i) {
        c(i);
        a(parcelable);
    }

    public final void a(atq atq) {
        if (atq != null) {
            try {
                a(a((Class) atq.getClass()).getName());
                atl c2 = c();
                try {
                    Class<?> cls = atq.getClass();
                    Method method = (Method) this.b.get(cls.getName());
                    if (method == null) {
                        method = a((Class) cls).getDeclaredMethod("write", new Class[]{cls, atl.class});
                        this.b.put(cls.getName(), method);
                    }
                    method.invoke((Object) null, new Object[]{atq, c2});
                    c2.b();
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e2) {
                    Throwable cause = e2.getCause();
                    if (cause instanceof RuntimeException) {
                        throw ((RuntimeException) cause);
                    } else if (cause instanceof Error) {
                        throw ((Error) cause);
                    } else {
                        throw new RuntimeException(e2);
                    }
                } catch (NoSuchMethodException e3) {
                    throw new RuntimeException(e3);
                } catch (ClassNotFoundException e4) {
                    throw new RuntimeException(e4);
                }
            } catch (ClassNotFoundException e5) {
                throw new RuntimeException(atq.getClass().getSimpleName() + " does not have a Parcelizer", e5);
            }
        } else {
            a((String) null);
        }
    }

    public final atq b(atq atq, int i) {
        return b(i) ? l() : atq;
    }

    public final CharSequence b(CharSequence charSequence, int i) {
        return b(i) ? i() : charSequence;
    }

    public final String b(String str, int i) {
        return b(i) ? f() : str;
    }

    public final boolean b(boolean z, int i) {
        return b(i) ? k() : z;
    }

    public final Object[] b(Object[] objArr, int i) {
        Serializable serializable;
        if (!b(i)) {
            return objArr;
        }
        int d = d();
        if (d < 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(d);
        if (d != 0) {
            int d2 = d();
            if (d2 == 1) {
                while (d > 0) {
                    arrayList.add(l());
                    d--;
                }
            } else if (d2 == 2) {
                while (d > 0) {
                    arrayList.add(j());
                    d--;
                }
            } else if (d2 == 3) {
                while (d > 0) {
                    String f = f();
                    if (f != null) {
                        try {
                            serializable = (Serializable) new atj(new ByteArrayInputStream(h())).readObject();
                        } catch (IOException e) {
                            throw new RuntimeException("Unable to read Serializable object (name = " + f + ")", e);
                        } catch (ClassNotFoundException e2) {
                            throw new RuntimeException("Unable to read Serializable object (name = " + f + ")", e2);
                        }
                    } else {
                        serializable = null;
                    }
                    arrayList.add(serializable);
                    d--;
                }
            } else if (d2 == 4) {
                while (d > 0) {
                    arrayList.add(f());
                    d--;
                }
            } else if (d2 == 5) {
                while (d > 0) {
                    arrayList.add(g());
                    d--;
                }
            }
        }
        return arrayList.toArray(objArr);
    }

    public final void a(atq atq, int i) {
        c(i);
        a(atq);
    }

    public final void a(CharSequence charSequence, int i) {
        c(i);
        a(charSequence);
    }

    public final void a(String str, int i) {
        c(i);
        a(str);
    }

    public final void a(boolean z, int i) {
        c(i);
        a(z);
    }

    public final void a(Object[] objArr, int i) {
        int i2;
        c(i);
        if (objArr != null) {
            int length = objArr.length;
            a(length);
            if (length > 0) {
                int i3 = 0;
                Object obj = objArr[0];
                if (obj instanceof String) {
                    i2 = 4;
                } else if (obj instanceof Parcelable) {
                    i2 = 2;
                } else if (obj instanceof atq) {
                    i2 = 1;
                } else if (obj instanceof Serializable) {
                    i2 = 3;
                } else if (obj instanceof IBinder) {
                    i2 = 5;
                } else if (obj instanceof Integer) {
                    i2 = 7;
                } else if (obj instanceof Float) {
                    i2 = 8;
                } else {
                    throw new IllegalArgumentException(obj.getClass().getName() + " cannot be VersionedParcelled");
                }
                a(i2);
                if (i2 == 1) {
                    while (i3 < length) {
                        a(objArr[i3]);
                        i3++;
                    }
                } else if (i2 == 2) {
                    while (i3 < length) {
                        a(objArr[i3]);
                        i3++;
                    }
                } else if (i2 == 3) {
                    while (i3 < length) {
                        Serializable serializable = objArr[i3];
                        if (serializable == null) {
                            a((String) null);
                        } else {
                            String name = serializable.getClass().getName();
                            a(name);
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            try {
                                ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                                objectOutputStream.writeObject(serializable);
                                objectOutputStream.close();
                                a(byteArrayOutputStream.toByteArray());
                            } catch (IOException e) {
                                throw new RuntimeException("VersionedParcelable encountered IOException writing serializable object (name = " + name + ")", e);
                            }
                        }
                        i3++;
                    }
                } else if (i2 == 4) {
                    while (i3 < length) {
                        a(objArr[i3]);
                        i3++;
                    }
                } else if (i2 == 5) {
                    while (i3 < length) {
                        a(objArr[i3]);
                        i3++;
                    }
                }
            }
        } else {
            a(-1);
        }
    }
}
