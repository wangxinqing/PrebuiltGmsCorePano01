package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: asv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class asv {
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.animation.Animator a(android.content.Context r9, android.content.res.Resources r10, android.content.res.Resources.Theme r11, int r12) {
        /*
            java.lang.String r0 = "Can't load animation resource ID #0x"
            r1 = 0
            android.content.res.XmlResourceParser r1 = r10.getAnimation(r12)     // Catch:{ XmlPullParserException -> 0x0040, IOException -> 0x0023, all -> 0x0021 }
            android.util.AttributeSet r6 = android.util.Xml.asAttributeSet(r1)     // Catch:{ XmlPullParserException -> 0x001f, IOException -> 0x001d }
            r7 = 0
            r8 = 0
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r1
            android.animation.Animator r9 = a(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ XmlPullParserException -> 0x001f, IOException -> 0x001d }
            if (r1 == 0) goto L_0x001a
            r1.close()
        L_0x001a:
            return r9
        L_0x001b:
            r9 = move-exception
            goto L_0x005d
        L_0x001d:
            r9 = move-exception
            goto L_0x0024
        L_0x001f:
            r9 = move-exception
            goto L_0x0041
        L_0x0021:
            r9 = move-exception
            goto L_0x005d
        L_0x0023:
            r9 = move-exception
        L_0x0024:
            android.content.res.Resources$NotFoundException r10 = new android.content.res.Resources$NotFoundException     // Catch:{ all -> 0x001b }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x001b }
            r11.<init>()     // Catch:{ all -> 0x001b }
            r11.append(r0)     // Catch:{ all -> 0x001b }
            java.lang.String r12 = java.lang.Integer.toHexString(r12)     // Catch:{ all -> 0x001b }
            r11.append(r12)     // Catch:{ all -> 0x001b }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x001b }
            r10.<init>(r11)     // Catch:{ all -> 0x001b }
            r10.initCause(r9)     // Catch:{ all -> 0x001b }
            throw r10     // Catch:{ all -> 0x001b }
        L_0x0040:
            r9 = move-exception
        L_0x0041:
            android.content.res.Resources$NotFoundException r10 = new android.content.res.Resources$NotFoundException     // Catch:{ all -> 0x001b }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x001b }
            r11.<init>()     // Catch:{ all -> 0x001b }
            r11.append(r0)     // Catch:{ all -> 0x001b }
            java.lang.String r12 = java.lang.Integer.toHexString(r12)     // Catch:{ all -> 0x001b }
            r11.append(r12)     // Catch:{ all -> 0x001b }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x001b }
            r10.<init>(r11)     // Catch:{ all -> 0x001b }
            r10.initCause(r9)     // Catch:{ all -> 0x001b }
            throw r10     // Catch:{ all -> 0x001b }
        L_0x005d:
            if (r1 == 0) goto L_0x0062
            r1.close()
        L_0x0062:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.asv.a(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, int):android.animation.Animator");
    }

    private static boolean a(int i) {
        return i >= 28 && i <= 31;
    }

    private static Animator a(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet, AnimatorSet animatorSet, int i) {
        Resources.Theme theme2;
        Resources resources2;
        int i2;
        PropertyValuesHolder[] propertyValuesHolderArr;
        String str;
        AttributeSet attributeSet2;
        PropertyValuesHolder propertyValuesHolder;
        int size;
        int i3;
        int i4;
        Keyframe keyframe;
        int i5;
        Resources resources3 = resources;
        Resources.Theme theme3 = theme;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        AnimatorSet animatorSet2 = animatorSet;
        int depth = xmlPullParser.getDepth();
        ValueAnimator valueAnimator = null;
        ArrayList arrayList = null;
        while (true) {
            int next = xmlPullParser.next();
            int i6 = 3;
            boolean z = false;
            if (next == 3 && xmlPullParser.getDepth() <= depth) {
                i2 = 0;
                break;
            }
            int i7 = 1;
            if (next == 1) {
                i2 = 0;
                break;
            }
            int i8 = 2;
            if (next == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("objectAnimator")) {
                    ObjectAnimator objectAnimator = new ObjectAnimator();
                    a(context, resources, theme, attributeSet, objectAnimator, xmlPullParser);
                    valueAnimator = objectAnimator;
                    z = false;
                } else if (name.equals("animator")) {
                    valueAnimator = a(context, resources, theme, attributeSet, (ValueAnimator) null, xmlPullParser);
                } else if (name.equals("set")) {
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    TypedArray a = lj.a(resources2, theme2, attributeSet, aso.h);
                    a(context, resources, theme, xmlPullParser, attributeSet, animatorSet3, lj.a(a, xmlPullParser2, "ordering", 0, 0));
                    a.recycle();
                    valueAnimator = animatorSet3;
                } else {
                    String str2 = "propertyValuesHolder";
                    if (name.equals(str2)) {
                        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
                        ArrayList arrayList2 = null;
                        while (true) {
                            int eventType = xmlPullParser.getEventType();
                            if (eventType != i6 && eventType != i7) {
                                if (eventType == i8) {
                                    if (xmlPullParser.getName().equals(str2)) {
                                        TypedArray a2 = lj.a(resources2, theme2, asAttributeSet, aso.i);
                                        String a3 = lj.a(a2, xmlPullParser2, "propertyName", i6);
                                        int a4 = lj.a(a2, xmlPullParser2, "valueType", i8, 4);
                                        int i9 = a4;
                                        ArrayList arrayList3 = null;
                                        while (true) {
                                            attributeSet2 = asAttributeSet;
                                            int next2 = xmlPullParser.next();
                                            str = str2;
                                            if (next2 == i6 || next2 == 1) {
                                                Context context2 = context;
                                            } else {
                                                if (!xmlPullParser.getName().equals("keyframe")) {
                                                    Context context3 = context;
                                                } else {
                                                    if (i9 == 4) {
                                                        TypedArray a5 = lj.a(resources2, theme2, Xml.asAttributeSet(xmlPullParser), aso.j);
                                                        TypedValue a6 = lj.a(a5, xmlPullParser2, "value");
                                                        if (a6 == null || !a(a6.type)) {
                                                            i5 = 0;
                                                        } else {
                                                            i5 = 3;
                                                        }
                                                        a5.recycle();
                                                        i9 = i5;
                                                    }
                                                    TypedArray a7 = lj.a(resources2, theme2, Xml.asAttributeSet(xmlPullParser), aso.j);
                                                    float a8 = lj.a(a7, xmlPullParser2, "fraction", 3, -1.0f);
                                                    TypedValue a9 = lj.a(a7, xmlPullParser2, "value");
                                                    if (i9 != 4) {
                                                        i4 = i9;
                                                    } else {
                                                        i4 = (a9 == null || !a(a9.type)) ? 0 : 3;
                                                    }
                                                    if (a9 != null) {
                                                        if (i4 != 0) {
                                                            keyframe = (i4 == 1 || i4 == 3) ? Keyframe.ofInt(a8, lj.a(a7, xmlPullParser2, "value", 0, 0)) : null;
                                                        } else {
                                                            keyframe = Keyframe.ofFloat(a8, lj.a(a7, xmlPullParser2, "value", 0, 0.0f));
                                                        }
                                                    } else if (i4 != 0) {
                                                        keyframe = Keyframe.ofInt(a8);
                                                    } else {
                                                        keyframe = Keyframe.ofFloat(a8);
                                                    }
                                                    int c = lj.c(a7, xmlPullParser2, "interpolator", 1);
                                                    if (c > 0) {
                                                        keyframe.setInterpolator(ast.a(context, c));
                                                    } else {
                                                        Context context4 = context;
                                                    }
                                                    a7.recycle();
                                                    if (keyframe != null) {
                                                        if (arrayList3 == null) {
                                                            arrayList3 = new ArrayList();
                                                        }
                                                        arrayList3.add(keyframe);
                                                    }
                                                    xmlPullParser.next();
                                                }
                                                resources2 = resources;
                                                theme2 = theme;
                                                asAttributeSet = attributeSet2;
                                                str2 = str;
                                                i6 = 3;
                                            }
                                        }
                                        Context context22 = context;
                                        if (arrayList3 == null || (size = arrayList3.size()) <= 0) {
                                            i6 = 3;
                                            propertyValuesHolder = null;
                                        } else {
                                            Keyframe keyframe2 = (Keyframe) arrayList3.get(0);
                                            Keyframe keyframe3 = (Keyframe) arrayList3.get(size - 1);
                                            float fraction = keyframe3.getFraction();
                                            if (fraction < 1.0f) {
                                                if (fraction >= 0.0f) {
                                                    arrayList3.add(arrayList3.size(), a(keyframe3, 1.0f));
                                                    size++;
                                                } else {
                                                    keyframe3.setFraction(1.0f);
                                                }
                                            }
                                            float fraction2 = keyframe2.getFraction();
                                            if (fraction2 != 0.0f) {
                                                if (fraction2 >= 0.0f) {
                                                    arrayList3.add(0, a(keyframe2, 0.0f));
                                                    size++;
                                                } else {
                                                    keyframe2.setFraction(0.0f);
                                                }
                                            }
                                            Keyframe[] keyframeArr = new Keyframe[size];
                                            arrayList3.toArray(keyframeArr);
                                            int i10 = 0;
                                            while (i10 < size) {
                                                Keyframe keyframe4 = keyframeArr[i10];
                                                if (keyframe4.getFraction() >= 0.0f) {
                                                    i3 = size;
                                                } else if (i10 != 0) {
                                                    int i11 = size - 1;
                                                    if (i10 != i11) {
                                                        int i12 = i10 + 1;
                                                        int i13 = i10;
                                                        while (i12 < i11 && keyframeArr[i12].getFraction() < 0.0f) {
                                                            i13 = i12;
                                                            i12++;
                                                        }
                                                        float fraction3 = (keyframeArr[i13 + 1].getFraction() - keyframeArr[i10 - 1].getFraction()) / ((float) ((i13 - i10) + 2));
                                                        int i14 = i10;
                                                        while (i14 <= i13) {
                                                            keyframeArr[i14].setFraction(keyframeArr[i14 - 1].getFraction() + fraction3);
                                                            i14++;
                                                            size = size;
                                                            i13 = i13;
                                                        }
                                                        i3 = size;
                                                    } else {
                                                        i3 = size;
                                                        keyframe4.setFraction(1.0f);
                                                    }
                                                } else {
                                                    i3 = size;
                                                    keyframe4.setFraction(0.0f);
                                                }
                                                i10++;
                                                size = i3;
                                            }
                                            propertyValuesHolder = PropertyValuesHolder.ofKeyframe(a3, keyframeArr);
                                            i6 = 3;
                                            if (i9 == 3) {
                                                propertyValuesHolder.setEvaluator(asw.a);
                                            }
                                        }
                                        if (propertyValuesHolder == null) {
                                            i7 = 1;
                                            propertyValuesHolder = a(a2, a4, 0, 1, a3);
                                        } else {
                                            i7 = 1;
                                        }
                                        if (propertyValuesHolder != null) {
                                            if (arrayList2 == null) {
                                                arrayList2 = new ArrayList();
                                            }
                                            arrayList2.add(propertyValuesHolder);
                                        }
                                        a2.recycle();
                                    } else {
                                        attributeSet2 = asAttributeSet;
                                        str = str2;
                                    }
                                    xmlPullParser.next();
                                    resources2 = resources;
                                    theme2 = theme;
                                    asAttributeSet = attributeSet2;
                                    str2 = str;
                                    i8 = 2;
                                } else {
                                    AttributeSet attributeSet3 = asAttributeSet;
                                    String str3 = str2;
                                    xmlPullParser.next();
                                    resources2 = resources;
                                    theme2 = theme;
                                    i8 = 2;
                                }
                            }
                        }
                        if (arrayList2 != null) {
                            int size2 = arrayList2.size();
                            propertyValuesHolderArr = new PropertyValuesHolder[size2];
                            for (int i15 = 0; i15 < size2; i15++) {
                                propertyValuesHolderArr[i15] = (PropertyValuesHolder) arrayList2.get(i15);
                            }
                        } else {
                            propertyValuesHolderArr = null;
                        }
                        if (propertyValuesHolderArr == null) {
                            z = true;
                        } else {
                            if (valueAnimator instanceof ValueAnimator) {
                                valueAnimator.setValues(propertyValuesHolderArr);
                            }
                            z = true;
                        }
                    } else {
                        throw new RuntimeException("Unknown animator name: " + xmlPullParser.getName());
                    }
                }
                if (animatorSet2 == null || z) {
                    resources3 = resources;
                    theme3 = theme;
                } else {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(valueAnimator);
                    resources3 = resources;
                    theme3 = theme;
                }
            } else {
                resources3 = resources;
                theme3 = theme;
            }
        }
        if (!(animatorSet2 == null || arrayList == null)) {
            Animator[] animatorArr = new Animator[arrayList.size()];
            int size3 = arrayList.size();
            int i16 = 0;
            while (i16 < size3) {
                animatorArr[i2] = (Animator) arrayList.get(i16);
                i16++;
                i2++;
            }
            if (i != 0) {
                animatorSet2.playSequentially(animatorArr);
            } else {
                animatorSet2.playTogether(animatorArr);
            }
        }
        return valueAnimator;
    }

    private static Keyframe a(Keyframe keyframe, float f) {
        if (keyframe.getType() == Float.TYPE) {
            return Keyframe.ofFloat(f);
        }
        return keyframe.getType() == Integer.TYPE ? Keyframe.ofInt(f) : Keyframe.ofObject(f);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v15, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v28, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v30, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.animation.PropertyValuesHolder a(android.content.res.TypedArray r11, int r12, int r13, int r14, java.lang.String r15) {
        /*
            android.util.TypedValue r0 = r11.peekValue(r13)
            r1 = 0
            if (r0 == 0) goto L_0x000a
            int r2 = r0.type
            goto L_0x000b
        L_0x000a:
            r2 = 0
        L_0x000b:
            android.util.TypedValue r3 = r11.peekValue(r14)
            if (r3 == 0) goto L_0x0014
            int r4 = r3.type
            goto L_0x0015
        L_0x0014:
            r4 = 0
        L_0x0015:
            r5 = 4
            r6 = 3
            if (r12 == r5) goto L_0x001a
            goto L_0x002d
        L_0x001a:
            if (r0 == 0) goto L_0x0024
            boolean r12 = a(r2)
            if (r12 == 0) goto L_0x0024
        L_0x0022:
            r12 = 3
            goto L_0x002d
        L_0x0024:
            if (r3 == 0) goto L_0x002c
            boolean r12 = a(r4)
            if (r12 != 0) goto L_0x0022
        L_0x002c:
            r12 = 0
        L_0x002d:
            r5 = 0
            r7 = 2
            r8 = 1
            if (r12 != r7) goto L_0x009a
            java.lang.String r12 = r11.getString(r13)
            java.lang.String r11 = r11.getString(r14)
            ln[] r13 = defpackage.lo.a((java.lang.String) r12)
            ln[] r14 = defpackage.lo.a((java.lang.String) r11)
            if (r13 != 0) goto L_0x0048
            if (r14 != 0) goto L_0x0048
            goto L_0x0169
        L_0x0048:
            if (r13 == 0) goto L_0x008c
            asu r0 = new asu
            r0.<init>()
            if (r14 == 0) goto L_0x0082
            boolean r2 = defpackage.lo.a((defpackage.ln[]) r13, (defpackage.ln[]) r14)
            if (r2 == 0) goto L_0x0063
            java.lang.Object[] r11 = new java.lang.Object[r7]
            r11[r1] = r13
            r11[r8] = r14
            android.animation.PropertyValuesHolder r5 = android.animation.PropertyValuesHolder.ofObject(r15, r0, r11)
            goto L_0x0169
        L_0x0063:
            android.view.InflateException r13 = new android.view.InflateException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = " Can't morph from "
            r14.append(r15)
            r14.append(r12)
            java.lang.String r12 = " to "
            r14.append(r12)
            r14.append(r11)
            java.lang.String r11 = r14.toString()
            r13.<init>(r11)
            throw r13
        L_0x0082:
            java.lang.Object[] r11 = new java.lang.Object[r8]
            r11[r1] = r13
            android.animation.PropertyValuesHolder r5 = android.animation.PropertyValuesHolder.ofObject(r15, r0, r11)
            goto L_0x0169
        L_0x008c:
            asu r11 = new asu
            r11.<init>()
            java.lang.Object[] r12 = new java.lang.Object[r8]
            r12[r1] = r14
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofObject(r15, r11, r12)
            return r11
        L_0x009a:
            if (r12 != r6) goto L_0x009f
            asw r6 = defpackage.asw.a
            goto L_0x00a0
        L_0x009f:
            r6 = r5
        L_0x00a0:
            r9 = 5
            r10 = 0
            if (r12 == 0) goto L_0x0118
            if (r0 != 0) goto L_0x00ce
            if (r3 != 0) goto L_0x00aa
            goto L_0x0161
        L_0x00aa:
            if (r4 != r9) goto L_0x00b2
            float r11 = r11.getDimension(r14, r10)
            int r11 = (int) r11
            goto L_0x00c2
        L_0x00b2:
            boolean r12 = a(r4)
            if (r12 == 0) goto L_0x00bd
            int r11 = r11.getColor(r14, r1)
            goto L_0x00c2
        L_0x00bd:
            int r11 = r11.getInt(r14, r1)
        L_0x00c2:
            int[] r12 = new int[r8]
            r12[r1] = r11
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofInt(r15, r12)
            r5 = r11
            goto L_0x0161
        L_0x00ce:
            if (r2 != r9) goto L_0x00d6
            float r12 = r11.getDimension(r13, r10)
            int r12 = (int) r12
            goto L_0x00e6
        L_0x00d6:
            boolean r12 = a(r2)
            if (r12 == 0) goto L_0x00e1
            int r12 = r11.getColor(r13, r1)
            goto L_0x00e6
        L_0x00e1:
            int r12 = r11.getInt(r13, r1)
        L_0x00e6:
            if (r3 != 0) goto L_0x00f3
            int[] r11 = new int[r8]
            r11[r1] = r12
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofInt(r15, r11)
            r5 = r11
            goto L_0x0161
        L_0x00f3:
            if (r4 != r9) goto L_0x00fb
            float r11 = r11.getDimension(r14, r10)
            int r11 = (int) r11
            goto L_0x010b
        L_0x00fb:
            boolean r13 = a(r4)
            if (r13 == 0) goto L_0x0106
            int r11 = r11.getColor(r14, r1)
            goto L_0x010b
        L_0x0106:
            int r11 = r11.getInt(r14, r1)
        L_0x010b:
            int[] r13 = new int[r7]
            r13[r1] = r12
            r13[r8] = r11
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofInt(r15, r13)
            r5 = r11
            goto L_0x0161
        L_0x0118:
            if (r0 != 0) goto L_0x0131
            if (r4 == r9) goto L_0x0121
            float r11 = r11.getFloat(r14, r10)
            goto L_0x0126
        L_0x0121:
            float r11 = r11.getDimension(r14, r10)
        L_0x0126:
            float[] r12 = new float[r8]
            r12[r1] = r11
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofFloat(r15, r12)
            r5 = r11
            goto L_0x0161
        L_0x0131:
            if (r2 == r9) goto L_0x0138
            float r12 = r11.getFloat(r13, r10)
            goto L_0x013d
        L_0x0138:
            float r12 = r11.getDimension(r13, r10)
        L_0x013d:
            if (r3 != 0) goto L_0x0149
            float[] r11 = new float[r8]
            r11[r1] = r12
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofFloat(r15, r11)
            r5 = r11
            goto L_0x0161
        L_0x0149:
            if (r4 == r9) goto L_0x0150
            float r11 = r11.getFloat(r14, r10)
            goto L_0x0155
        L_0x0150:
            float r11 = r11.getDimension(r14, r10)
        L_0x0155:
            float[] r13 = new float[r7]
            r13[r1] = r12
            r13[r8] = r11
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofFloat(r15, r13)
            r5 = r11
        L_0x0161:
            if (r5 == 0) goto L_0x0169
            if (r6 == 0) goto L_0x0169
            r5.setEvaluator(r6)
            return r5
        L_0x0169:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.asv.a(android.content.res.TypedArray, int, int, int, java.lang.String):android.animation.PropertyValuesHolder");
    }

    private static ValueAnimator a(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, XmlPullParser xmlPullParser) {
        ValueAnimator valueAnimator2;
        ValueAnimator valueAnimator3;
        int i;
        ValueAnimator valueAnimator4;
        PropertyValuesHolder propertyValuesHolder;
        PropertyValuesHolder propertyValuesHolder2;
        int i2;
        int i3;
        Resources resources2 = resources;
        Resources.Theme theme2 = theme;
        AttributeSet attributeSet2 = attributeSet;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        TypedArray a = lj.a(resources2, theme2, attributeSet2, aso.g);
        TypedArray a2 = lj.a(resources2, theme2, attributeSet2, aso.k);
        if (valueAnimator == null) {
            valueAnimator2 = new ValueAnimator();
        } else {
            valueAnimator2 = valueAnimator;
        }
        long a3 = (long) lj.a(a, xmlPullParser2, "duration", 1, 300);
        boolean z = false;
        long a4 = (long) lj.a(a, xmlPullParser2, "startOffset", 2, 0);
        int a5 = lj.a(a, xmlPullParser2, "valueType", 7, 4);
        if (lj.a(xmlPullParser2, "valueFrom") && lj.a(xmlPullParser2, "valueTo")) {
            if (a5 == 4) {
                TypedValue peekValue = a.peekValue(5);
                if (peekValue != null) {
                    i2 = peekValue.type;
                } else {
                    i2 = 0;
                }
                TypedValue peekValue2 = a.peekValue(6);
                if (peekValue2 != null) {
                    i3 = peekValue2.type;
                } else {
                    i3 = 0;
                }
                a5 = ((peekValue == null || !a(i2)) && (peekValue2 == null || !a(i3))) ? 0 : 3;
            }
            PropertyValuesHolder a6 = a(a, a5, 5, 6, "");
            if (a6 != null) {
                valueAnimator2.setValues(new PropertyValuesHolder[]{a6});
            }
        }
        valueAnimator2.setDuration(a3);
        valueAnimator2.setStartDelay(a4);
        valueAnimator2.setRepeatCount(lj.a(a, xmlPullParser2, "repeatCount", 3, 0));
        valueAnimator2.setRepeatMode(lj.a(a, xmlPullParser2, "repeatMode", 4, 1));
        if (a2 != null) {
            ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator2;
            String a7 = lj.a(a2, xmlPullParser2, "pathData", 1);
            if (a7 != null) {
                String a8 = lj.a(a2, xmlPullParser2, "propertyXName", 2);
                String a9 = lj.a(a2, xmlPullParser2, "propertyYName", 3);
                if (a8 == null && a9 == null) {
                    throw new InflateException(a2.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
                }
                Path path = new Path();
                ln[] a10 = lo.a(a7);
                if (a10 != null) {
                    try {
                        ln.a(a10, path);
                    } catch (RuntimeException e) {
                        throw new RuntimeException("Error in parsing " + a7, e);
                    }
                } else {
                    path = null;
                }
                PathMeasure pathMeasure = new PathMeasure(path, false);
                ArrayList arrayList = new ArrayList();
                arrayList.add(Float.valueOf(0.0f));
                float f = 0.0f;
                while (true) {
                    f += pathMeasure.getLength();
                    arrayList.add(Float.valueOf(f));
                    if (!pathMeasure.nextContour()) {
                        break;
                    }
                    ValueAnimator valueAnimator5 = valueAnimator2;
                    z = false;
                }
                PathMeasure pathMeasure2 = new PathMeasure(path, z);
                int min = Math.min(100, ((int) (f / 0.5f)) + 1);
                float[] fArr = new float[min];
                float[] fArr2 = new float[min];
                float[] fArr3 = new float[2];
                float f2 = f / ((float) (min - 1));
                int i4 = 0;
                int i5 = 0;
                float f3 = 0.0f;
                while (i4 < min) {
                    int i6 = min;
                    ValueAnimator valueAnimator6 = valueAnimator2;
                    pathMeasure2.getPosTan(f3 - ((Float) arrayList.get(i5)).floatValue(), fArr3, (float[]) null);
                    fArr[i4] = fArr3[0];
                    fArr2[i4] = fArr3[1];
                    f3 += f2;
                    int i7 = i5 + 1;
                    if (i7 < arrayList.size() && f3 > ((Float) arrayList.get(i7)).floatValue()) {
                        pathMeasure2.nextContour();
                        i5 = i7;
                    }
                    i4++;
                    valueAnimator2 = valueAnimator6;
                    min = i6;
                }
                valueAnimator3 = valueAnimator2;
                if (a8 != null) {
                    propertyValuesHolder = PropertyValuesHolder.ofFloat(a8, fArr);
                } else {
                    propertyValuesHolder = null;
                }
                if (a9 != null) {
                    propertyValuesHolder2 = PropertyValuesHolder.ofFloat(a9, fArr2);
                } else {
                    propertyValuesHolder2 = null;
                }
                if (propertyValuesHolder == null) {
                    i = 0;
                    objectAnimator.setValues(new PropertyValuesHolder[]{propertyValuesHolder2});
                } else {
                    i = 0;
                    if (propertyValuesHolder2 != null) {
                        objectAnimator.setValues(new PropertyValuesHolder[]{propertyValuesHolder, propertyValuesHolder2});
                    } else {
                        objectAnimator.setValues(new PropertyValuesHolder[]{propertyValuesHolder});
                        i = 0;
                    }
                }
            } else {
                valueAnimator3 = valueAnimator2;
                i = 0;
                objectAnimator.setPropertyName(lj.a(a2, xmlPullParser2, "propertyName", 0));
            }
        } else {
            valueAnimator3 = valueAnimator2;
            i = 0;
        }
        int c = lj.c(a, xmlPullParser2, "interpolator", i);
        if (c > 0) {
            valueAnimator4 = valueAnimator3;
            valueAnimator4.setInterpolator(ast.a(context, c));
        } else {
            valueAnimator4 = valueAnimator3;
        }
        a.recycle();
        if (a2 != null) {
            a2.recycle();
        }
        return valueAnimator4;
    }
}
