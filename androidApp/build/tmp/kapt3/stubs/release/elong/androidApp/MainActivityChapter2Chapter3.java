package elong.androidApp;

import java.lang.System;

@kotlin.Suppress(names = {"DEPRECATED_IDENTITY_EQUALS"})
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00a8\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0002\n\u0002\b1\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0002\u00fc\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\n\u0010\u00bf\u0001\u001a\u00030\u00c0\u0001H\u0002J\n\u0010\u00c1\u0001\u001a\u00030\u00c0\u0001H\u0002J\n\u0010\u00c2\u0001\u001a\u00030\u00c0\u0001H\u0002J\n\u0010\u00c3\u0001\u001a\u00030\u00c0\u0001H\u0002J\n\u0010\u00c4\u0001\u001a\u00030\u00c0\u0001H\u0002J\n\u0010\u00c5\u0001\u001a\u00030\u00c0\u0001H\u0002J\n\u0010\u00c6\u0001\u001a\u00030\u00c0\u0001H\u0002J\n\u0010\u00c7\u0001\u001a\u00030\u00c0\u0001H\u0002J\n\u0010\u00c8\u0001\u001a\u00030\u00c0\u0001H\u0002J\n\u0010\u00c9\u0001\u001a\u00030\u00c0\u0001H\u0002J\n\u0010\u00ca\u0001\u001a\u00030\u00c0\u0001H\u0002J\n\u0010\u00cb\u0001\u001a\u00030\u00c0\u0001H\u0002J\n\u0010\u00cc\u0001\u001a\u00030\u00c0\u0001H\u0002J\n\u0010\u00cd\u0001\u001a\u00030\u00c0\u0001H\u0002J\n\u0010\u00ce\u0001\u001a\u00030\u00c0\u0001H\u0002J\n\u0010\u00cf\u0001\u001a\u00030\u00c0\u0001H\u0002J\n\u0010\u00d0\u0001\u001a\u00030\u00c0\u0001H\u0002J\n\u0010\u00d1\u0001\u001a\u00030\u00c0\u0001H\u0002J\n\u0010\u00d2\u0001\u001a\u00030\u00c0\u0001H\u0002J\n\u0010\u00d3\u0001\u001a\u00030\u00c0\u0001H\u0002J\n\u0010\u00d4\u0001\u001a\u00030\u00c0\u0001H\u0002J\n\u0010\u00d5\u0001\u001a\u00030\u00c0\u0001H\u0002J\n\u0010\u00d6\u0001\u001a\u00030\u00c0\u0001H\u0002J\n\u0010\u00d7\u0001\u001a\u00030\u00c0\u0001H\u0002J\n\u0010\u00d8\u0001\u001a\u00030\u00c0\u0001H\u0002J\n\u0010\u00d9\u0001\u001a\u00030\u00c0\u0001H\u0002J\n\u0010\u00da\u0001\u001a\u00030\u00c0\u0001H\u0002J\n\u0010\u00db\u0001\u001a\u00030\u00c0\u0001H\u0002J\u0013\u0010\u00dc\u0001\u001a\u00030\u00c0\u00012\u0007\u0010\u00dd\u0001\u001a\u00020\u0010H\u0002J\n\u0010\u00de\u0001\u001a\u00030\u00c0\u0001H\u0002J\u0013\u0010\u00df\u0001\u001a\u00030\u00c0\u00012\u0007\u0010\u00dd\u0001\u001a\u00020\u0010H\u0002J\n\u0010\u00e0\u0001\u001a\u00030\u00c0\u0001H\u0002J\n\u0010\u00e1\u0001\u001a\u00030\u00c0\u0001H\u0002J\n\u0010\u00e2\u0001\u001a\u00030\u00c0\u0001H\u0002J\n\u0010\u00e3\u0001\u001a\u00030\u00c0\u0001H\u0002J\n\u0010\u00e4\u0001\u001a\u00030\u00c0\u0001H\u0002J\n\u0010\u00e5\u0001\u001a\u00030\u00c0\u0001H\u0002J\n\u0010\u00e6\u0001\u001a\u00030\u00c0\u0001H\u0002J\u0013\u0010\u00e7\u0001\u001a\u00030\u00c0\u00012\u0007\u0010\u00e8\u0001\u001a\u00020\u0004H\u0002J\u0013\u0010\u00e9\u0001\u001a\u00030\u00c0\u00012\u0007\u0010\u00e8\u0001\u001a\u00020\u0004H\u0002J\n\u0010\u00ea\u0001\u001a\u00030\u00c0\u0001H\u0002J\n\u0010\u00eb\u0001\u001a\u00030\u00c0\u0001H\u0002J\n\u0010\u00ec\u0001\u001a\u00030\u00c0\u0001H\u0002J\n\u0010\u00ed\u0001\u001a\u00030\u00c0\u0001H\u0002J(\u0010\u00ee\u0001\u001a\u00030\u00c0\u00012\u0007\u0010\u00ef\u0001\u001a\u00020\u00102\u0007\u0010\u00f0\u0001\u001a\u00020\u00102\n\u0010\u00f1\u0001\u001a\u0005\u0018\u00010\u00f2\u0001H\u0014J\u0016\u0010\u00f3\u0001\u001a\u00030\u00c0\u00012\n\u0010\u00f4\u0001\u001a\u0005\u0018\u00010\u00f5\u0001H\u0014J\n\u0010\u00f6\u0001\u001a\u00030\u00c0\u0001H\u0014J\n\u0010\u00f7\u0001\u001a\u00030\u00c0\u0001H\u0014J\n\u0010\u00f8\u0001\u001a\u00030\u00c0\u0001H\u0014J\n\u0010\u00f9\u0001\u001a\u00030\u00c0\u0001H\u0014J\n\u0010\u00fa\u0001\u001a\u00030\u00c0\u0001H\u0014J\n\u0010\u00fb\u0001\u001a\u00030\u00c0\u0001H\u0014R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082D\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001c\u0010$\u001a\u0004\u0018\u00010\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010!\"\u0004\b&\u0010#R\"\u0010\'\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001b\"\u0004\b)\u0010\u001dR\u001c\u0010*\u001a\u0004\u0018\u00010+X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001c\u00100\u001a\u0004\u0018\u000101X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001c\u00106\u001a\u0004\u0018\u000101X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u00103\"\u0004\b8\u00105R\u001c\u00109\u001a\u0004\u0018\u000101X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u00103\"\u0004\b;\u00105R\u001c\u0010<\u001a\u0004\u0018\u000101X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u00103\"\u0004\b>\u00105R\u001c\u0010?\u001a\u0004\u0018\u000101X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u00103\"\u0004\bA\u00105R\u001c\u0010B\u001a\u0004\u0018\u000101X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bC\u00103\"\u0004\bD\u00105R\u001c\u0010E\u001a\u0004\u0018\u000101X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bF\u00103\"\u0004\bG\u00105R\u001c\u0010H\u001a\u0004\u0018\u000101X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bI\u00103\"\u0004\bJ\u00105R\u001c\u0010K\u001a\u0004\u0018\u000101X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bL\u00103\"\u0004\bM\u00105R\u001c\u0010N\u001a\u0004\u0018\u000101X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bO\u00103\"\u0004\bP\u00105R\u001c\u0010Q\u001a\u0004\u0018\u000101X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bR\u00103\"\u0004\bS\u00105R\u001c\u0010T\u001a\u0004\u0018\u00010UX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\u001c\u0010Z\u001a\u0004\u0018\u00010[X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\u001c\u0010`\u001a\u0004\u0018\u00010aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\u001c\u0010f\u001a\u0004\u0018\u00010aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bg\u0010c\"\u0004\bh\u0010eR\u001c\u0010i\u001a\u0004\u0018\u00010aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bj\u0010c\"\u0004\bk\u0010eR\u001c\u0010l\u001a\u0004\u0018\u00010aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bm\u0010c\"\u0004\bn\u0010eR\u001c\u0010o\u001a\u0004\u0018\u00010aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bp\u0010c\"\u0004\bq\u0010eR\u001a\u0010r\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bs\u0010\u0006\"\u0004\bt\u0010\bR\u001a\u0010u\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bv\u0010\u0006\"\u0004\bw\u0010\bR\"\u0010x\u001a\n\u0012\u0004\u0012\u00020z\u0018\u00010yX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~R%\u0010\u007f\u001a\u000b\u0012\u0005\u0012\u00030\u0080\u0001\u0018\u00010yX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0081\u0001\u0010|\"\u0005\b\u0082\u0001\u0010~R%\u0010\u0083\u0001\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010yX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0084\u0001\u0010|\"\u0005\b\u0085\u0001\u0010~R%\u0010\u0086\u0001\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010yX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0087\u0001\u0010|\"\u0005\b\u0088\u0001\u0010~R%\u0010\u0089\u0001\u001a\n\u0012\u0004\u0012\u00020z\u0018\u00010yX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u008a\u0001\u0010|\"\u0005\b\u008b\u0001\u0010~R\"\u0010\u008c\u0001\u001a\u0005\u0018\u00010\u008d\u0001X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001\"\u0006\b\u0090\u0001\u0010\u0091\u0001R\"\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u0093\u0001X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001\"\u0006\b\u0096\u0001\u0010\u0097\u0001R\"\u0010\u0098\u0001\u001a\u0005\u0018\u00010\u0099\u0001X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001\"\u0006\b\u009c\u0001\u0010\u009d\u0001R\"\u0010\u009e\u0001\u001a\u0005\u0018\u00010\u0099\u0001X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u009f\u0001\u0010\u009b\u0001\"\u0006\b\u00a0\u0001\u0010\u009d\u0001R\"\u0010\u00a1\u0001\u001a\u0005\u0018\u00010\u0099\u0001X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00a2\u0001\u0010\u009b\u0001\"\u0006\b\u00a3\u0001\u0010\u009d\u0001R\"\u0010\u00a4\u0001\u001a\u0005\u0018\u00010\u00a5\u0001X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00a6\u0001\u0010\u00a7\u0001\"\u0006\b\u00a8\u0001\u0010\u00a9\u0001R\"\u0010\u00aa\u0001\u001a\u0005\u0018\u00010\u00a5\u0001X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00ab\u0001\u0010\u00a7\u0001\"\u0006\b\u00ac\u0001\u0010\u00a9\u0001R\"\u0010\u00ad\u0001\u001a\u0005\u0018\u00010\u0099\u0001X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00ae\u0001\u0010\u009b\u0001\"\u0006\b\u00af\u0001\u0010\u009d\u0001R\"\u0010\u00b0\u0001\u001a\u0005\u0018\u00010\u0099\u0001X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00b1\u0001\u0010\u009b\u0001\"\u0006\b\u00b2\u0001\u0010\u009d\u0001R\"\u0010\u00b3\u0001\u001a\u0005\u0018\u00010\u0099\u0001X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00b4\u0001\u0010\u009b\u0001\"\u0006\b\u00b5\u0001\u0010\u009d\u0001R\"\u0010\u00b6\u0001\u001a\u0005\u0018\u00010\u0099\u0001X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00b7\u0001\u0010\u009b\u0001\"\u0006\b\u00b8\u0001\u0010\u009d\u0001R\"\u0010\u00b9\u0001\u001a\u0005\u0018\u00010\u0099\u0001X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00ba\u0001\u0010\u009b\u0001\"\u0006\b\u00bb\u0001\u0010\u009d\u0001R\"\u0010\u00bc\u0001\u001a\u0005\u0018\u00010\u0099\u0001X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00bd\u0001\u0010\u009b\u0001\"\u0006\b\u00be\u0001\u0010\u009d\u0001\u00a8\u0006\u00fd\u0001"}, d2 = {"Lelong/androidApp/MainActivityChapter2Chapter3;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "DATABASE_NAME_CONTACT", "", "getDATABASE_NAME_CONTACT", "()Ljava/lang/String;", "setDATABASE_NAME_CONTACT", "(Ljava/lang/String;)V", "DATABASE_NAME_PROJECT", "getDATABASE_NAME_PROJECT", "setDATABASE_NAME_PROJECT", "DB_PATH_SUFFIX", "getDB_PATH_SUFFIX", "setDB_PATH_SUFFIX", "MY_PERMISSION_REQUEST_CALL_PHONE", "", "MY_PERMISSION_REQUEST_SEND_SMS", "adapterDanhBaDatabase", "Lelong/androidApp/adapter/arrayAdapter/chapter1_2_3_7/DanhBaAdapter;", "getAdapterDanhBaDatabase", "()Lelong/androidApp/adapter/arrayAdapter/chapter1_2_3_7/DanhBaAdapter;", "setAdapterDanhBaDatabase", "(Lelong/androidApp/adapter/arrayAdapter/chapter1_2_3_7/DanhBaAdapter;)V", "adapterFont", "Landroid/widget/ArrayAdapter;", "getAdapterFont", "()Landroid/widget/ArrayAdapter;", "setAdapterFont", "(Landroid/widget/ArrayAdapter;)V", "adapterLikeSongDatabase", "Lelong/androidApp/adapter/arrayAdapter/chapter1_3/MusicAdapter;", "getAdapterLikeSongDatabase", "()Lelong/androidApp/adapter/arrayAdapter/chapter1_3/MusicAdapter;", "setAdapterLikeSongDatabase", "(Lelong/androidApp/adapter/arrayAdapter/chapter1_3/MusicAdapter;)V", "adapterListSongDatabase", "getAdapterListSongDatabase", "setAdapterListSongDatabase", "adapterMusic", "getAdapterMusic", "setAdapterMusic", "binding", "Lelong/androidApp/databinding/ActivityMainChapter23Binding;", "getBinding", "()Lelong/androidApp/databinding/ActivityMainChapter23Binding;", "setBinding", "(Lelong/androidApp/databinding/ActivityMainChapter23Binding;)V", "btnAddOrUpdateDanhBa", "Landroid/widget/Button;", "getBtnAddOrUpdateDanhBa", "()Landroid/widget/Button;", "setBtnAddOrUpdateDanhBa", "(Landroid/widget/Button;)V", "btnCallActivity", "getBtnCallActivity", "setBtnCallActivity", "btnCheMotPhan", "getBtnCheMotPhan", "setBtnCheMotPhan", "btnCheToanBo", "getBtnCheToanBo", "setBtnCheToanBo", "btnDeleteDanhBa", "getBtnDeleteDanhBa", "setBtnDeleteDanhBa", "btnDialActivity", "getBtnDialActivity", "setBtnDialActivity", "btnMessengerActivity", "getBtnMessengerActivity", "setBtnMessengerActivity", "btnReadDanhBaOfMine", "getBtnReadDanhBaOfMine", "setBtnReadDanhBaOfMine", "btnReadMessageOfMine", "getBtnReadMessageOfMine", "setBtnReadMessageOfMine", "btnSendData", "getBtnSendData", "setBtnSendData", "btnSendDataAndAnswer", "getBtnSendDataAndAnswer", "setBtnSendDataAndAnswer", "chkSaveInforLogin", "Landroid/widget/CheckBox;", "getChkSaveInforLogin", "()Landroid/widget/CheckBox;", "setChkSaveInforLogin", "(Landroid/widget/CheckBox;)V", "dbDanhBa", "Landroid/database/sqlite/SQLiteDatabase;", "getDbDanhBa", "()Landroid/database/sqlite/SQLiteDatabase;", "setDbDanhBa", "(Landroid/database/sqlite/SQLiteDatabase;)V", "lvDanhBaDatabase", "Landroid/widget/ListView;", "getLvDanhBaDatabase", "()Landroid/widget/ListView;", "setLvDanhBaDatabase", "(Landroid/widget/ListView;)V", "lvFont", "getLvFont", "setLvFont", "lvMusic", "getLvMusic", "setLvMusic", "lvSongLikeDatabse", "getLvSongLikeDatabse", "setLvSongLikeDatabse", "lvSongListDatabse", "getLvSongListDatabse", "setLvSongListDatabse", "nameInformationLogin", "getNameInformationLogin", "setNameInformationLogin", "nameSaver", "getNameSaver", "setNameSaver", "sourceLikeSongDatabase", "", "Lelong/models/chapter1_3/Music;", "getSourceLikeSongDatabase", "()Ljava/util/List;", "setSourceLikeSongDatabase", "(Ljava/util/List;)V", "sourceListDanhBaDatabase", "Lelong/models/chapter1_2_3_7/DanhBa;", "getSourceListDanhBaDatabase", "setSourceListDanhBaDatabase", "sourceListFont", "getSourceListFont", "setSourceListFont", "sourceListMusic", "getSourceListMusic", "setSourceListMusic", "sourceListSongDatabase", "getSourceListSongDatabase", "setSourceListSongDatabase", "svSearchSong", "Landroid/widget/SearchView;", "getSvSearchSong", "()Landroid/widget/SearchView;", "setSvSearchSong", "(Landroid/widget/SearchView;)V", "tabHostMusicDatabase", "Landroid/widget/TabHost;", "getTabHostMusicDatabase", "()Landroid/widget/TabHost;", "setTabHostMusicDatabase", "(Landroid/widget/TabHost;)V", "txtAsendData", "Landroid/widget/EditText;", "getTxtAsendData", "()Landroid/widget/EditText;", "setTxtAsendData", "(Landroid/widget/EditText;)V", "txtBsendData", "getTxtBsendData", "setTxtBsendData", "txtCodeDanhBaDatabase", "getTxtCodeDanhBaDatabase", "setTxtCodeDanhBaDatabase", "txtFont", "Landroid/widget/TextView;", "getTxtFont", "()Landroid/widget/TextView;", "setTxtFont", "(Landroid/widget/TextView;)V", "txtKetQuaSendData", "getTxtKetQuaSendData", "setTxtKetQuaSendData", "txtMessengerActivity", "getTxtMessengerActivity", "setTxtMessengerActivity", "txtNameDanhBaDatabase", "getTxtNameDanhBaDatabase", "setTxtNameDanhBaDatabase", "txtPassword", "getTxtPassword", "setTxtPassword", "txtPhoneActivity", "getTxtPhoneActivity", "setTxtPhoneActivity", "txtPhoneDanhBaDatabase", "getTxtPhoneDanhBaDatabase", "setTxtPhoneDanhBaDatabase", "txtUsername", "getTxtUsername", "setTxtUsername", "addControlChapter2ExplicitIntent", "", "addControlChapter2ImplicitIntent", "addControlChapter3AssetsAndSharedPreferencesFont", "addControlChapter3AssetsAndSharedPreferencesLogin", "addControlChapter3AssetsAndSharedPreferencesLoginSaveStatusInOnPause", "addControlChapter3AssetsAndSharedPreferencesLoginSaveStatusInOnResume", "addControlChapter3AssetsAndSharedPreferencesPlayMusic", "addControlChapter3ContentProviderReadContactAndSMSFromMobile", "addControlChapter3SQLiteCopyDatabaseFromAssetsToMobileSystem", "addControlChapter3SQLiteCopyDatabaseFromAssetsToMobileSystemProjectKaraoke", "addControlChapter3SQLiteShowDatabaseToGUIProjectKaraoke", "addControlChapter3SQLiteShowDatabaseToGraphicUserInterface", "addControlChapter3SQLiteShowDatabaseToGraphicUserInterfaceShowAllDanhBa", "addControls", "addControlsChapter2", "addControlsChapter2ActivitynLifetime", "addControlsChapter3", "addEventChapter2", "addEventChapter2ActivitynLifetime", "addEventChapter2ExplicitIntent", "addEventChapter2ExplicitIntentSendDataAndAnswerUSCLN", "addEventChapter2ExplicitIntentSendDataZuaCacActivity", "addEventChapter2ImplicitIntent", "addEventChapter2ImplicitIntentCallActivity", "addEventChapter2ImplicitIntentDialActivity", "addEventChapter2ImplicitIntentMessengerActivity", "addEventChapter3", "addEventChapter3AssetsAndSharedPreferencesFont", "addEventChapter3AssetsAndSharedPreferencesFontXuLyChangeFont", "position", "addEventChapter3AssetsAndSharedPreferencesLoginPlayMusic", "addEventChapter3AssetsAndSharedPreferencesLoginPlayMusicXuLyListenSong", "addEventChapter3ContentProviderReadContactAndSMSFromMobile", "addEventChapter3ContentProviderReadContactFromMobile", "addEventChapter3ContentProviderReadSMSFromMobile", "addEventChapter3SQLitePutDatabaseToGraphicUserInterface", "addEventChapter3SQLitePutDatabaseToGraphicUserInterfaceAddOrUpdateDanhBaDatabase", "addEventChapter3SQLitePutDatabaseToGraphicUserInterfaceDeleteDanhBaDatabase", "addEventChapter3SQLiteShowDatabaseToGUIProjectKaraoke", "addEventChapter3SQLiteShowDatabaseToGUIProjectKaraokeSearchLikedMusic", "name", "addEventChapter3SQLiteShowDatabaseToGUIProjectKaraokeSearchListMusic", "addEventChapter3SQLiteShowDatabaseToGUIProjectKaraokeShowAllMusic", "addEventChapter3SQLiteShowDatabaseToGUIProjectKaraokeShowLikedMusic", "addEvents", "dataBindingChapter2", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onPause", "onRestart", "onResume", "onStart", "onStop", "database", "androidApp_release"})
public final class MainActivityChapter2Chapter3 extends androidx.appcompat.app.AppCompatActivity {
    @org.jetbrains.annotations.Nullable()
    private elong.androidApp.databinding.ActivityMainChapter23Binding binding;
    
    /**
     * Activity and lifetime of activity (Cần config trong file Manifests).Add thêm 2 Activity là (Chapter2Che1PhanActivity, activity_chapter2_che1_phan.xml) và (Chapter2CheToanBoActivity, activity_chapter2_che_toan_bo.xml)
     */
    @org.jetbrains.annotations.Nullable()
    private android.widget.Button btnCheToanBo;
    @org.jetbrains.annotations.Nullable()
    private android.widget.Button btnCheMotPhan;
    
    /**
     * Explicit Intent (Cần config trong file Manifests).Add thêm 2 Activity là (Chapter2SendDataActivity, activity_chapter2_send_data.xml) và (Chapter2SendDatanAnswerActivity, activity_chapter2_send_data_n_answer.xml)
     */
    @org.jetbrains.annotations.Nullable()
    private android.widget.EditText txtAsendData;
    @org.jetbrains.annotations.Nullable()
    private android.widget.EditText txtBsendData;
    @org.jetbrains.annotations.Nullable()
    private android.widget.TextView txtKetQuaSendData;
    @org.jetbrains.annotations.Nullable()
    private android.widget.Button btnSendData;
    @org.jetbrains.annotations.Nullable()
    private android.widget.Button btnSendDataAndAnswer;
    
    /**
     * Intent gọi đến các ứng dụng của HĐH (Implicit Intent) -> Add thêm file ImplicitIntent và xử lý service trong file services/chapter2ImplicitIntent/ImplicitIntent
     */
    @org.jetbrains.annotations.Nullable()
    private android.widget.EditText txtPhoneActivity;
    @org.jetbrains.annotations.Nullable()
    private android.widget.EditText txtMessengerActivity;
    @org.jetbrains.annotations.Nullable()
    private android.widget.Button btnDialActivity;
    @org.jetbrains.annotations.Nullable()
    private android.widget.Button btnCallActivity;
    @org.jetbrains.annotations.Nullable()
    private android.widget.Button btnMessengerActivity;
    private final int MY_PERMISSION_REQUEST_SEND_SMS = 0;
    private final int MY_PERMISSION_REQUEST_CALL_PHONE = 0;
    
    /**
     * Assets và Shared Preferences (Font). Add thêm thư mục assets (con của folder main) -> truy cập đến folder /font trong assets
     */
    @org.jetbrains.annotations.Nullable()
    private android.widget.TextView txtFont;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String nameSaver = "TrangThaiFont";
    @org.jetbrains.annotations.Nullable()
    private android.widget.ListView lvFont;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<java.lang.String> sourceListFont;
    @org.jetbrains.annotations.Nullable()
    private android.widget.ArrayAdapter<java.lang.String> adapterFont;
    
    /**
     * Assets và Shared Preferences (Login, lưu thông tin trạng thái đăng nhập trong onPause, và phục hồi thông tin trạng thái đăng  nhập trong onResume)
     */
    @org.jetbrains.annotations.Nullable()
    private android.widget.EditText txtUsername;
    @org.jetbrains.annotations.Nullable()
    private android.widget.EditText txtPassword;
    @org.jetbrains.annotations.Nullable()
    private android.widget.CheckBox chkSaveInforLogin;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String nameInformationLogin = "LuuThongTinLogin";
    
    /**
     * Assets và Shared Preferences (Play Music)
     */
    @org.jetbrains.annotations.Nullable()
    private android.widget.ListView lvMusic;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<java.lang.String> sourceListMusic;
    @org.jetbrains.annotations.Nullable()
    private android.widget.ArrayAdapter<java.lang.String> adapterMusic;
    
    /**
     * Tương tác với SQLite (Sao chép Data từ SQLite vào hệ thống)
     */
    @org.jetbrains.annotations.NotNull()
    private java.lang.String DB_PATH_SUFFIX = "/databases/";
    
    /**
     * Tương tác với SQLite (Đưa data lên zao diện)
     */
    @org.jetbrains.annotations.Nullable()
    private android.database.sqlite.SQLiteDatabase dbDanhBa;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String DATABASE_NAME_CONTACT = "dbContact.sqlite";
    @org.jetbrains.annotations.Nullable()
    private android.widget.ListView lvDanhBaDatabase;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<elong.models.chapter1_2_3_7.DanhBa> sourceListDanhBaDatabase;
    @org.jetbrains.annotations.Nullable()
    private elong.androidApp.adapter.arrayAdapter.chapter1_2_3_7.DanhBaAdapter adapterDanhBaDatabase;
    @org.jetbrains.annotations.Nullable()
    private android.widget.Button btnAddOrUpdateDanhBa;
    @org.jetbrains.annotations.Nullable()
    private android.widget.Button btnDeleteDanhBa;
    @org.jetbrains.annotations.Nullable()
    private android.widget.EditText txtNameDanhBaDatabase;
    @org.jetbrains.annotations.Nullable()
    private android.widget.EditText txtCodeDanhBaDatabase;
    @org.jetbrains.annotations.Nullable()
    private android.widget.EditText txtPhoneDanhBaDatabase;
    
    /**
     * Content Provider -> Đọc danh bạ và tin nhắn trong hệ thống bằng Content Provider. Add thêm 2 Activity là (Chapter3ContentProviderReadContact, activity_chapter3_content_provider_read_contact.xml) và (Chapter3ContentProviderReadSMS, activity_chapter3_content_provider_read_sms.xml)
     */
    @org.jetbrains.annotations.Nullable()
    private android.widget.Button btnReadDanhBaOfMine;
    @org.jetbrains.annotations.Nullable()
    private android.widget.Button btnReadMessageOfMine;
    
    /**
     * PROJECT CHƯƠNG 3: ASSETS, SHARED PREFERENCES, QUẢN LÝ DỮ LIỆU VÀ CONTENTPROVIDER
     */
    @org.jetbrains.annotations.Nullable()
    private android.widget.TabHost tabHostMusicDatabase;
    @org.jetbrains.annotations.Nullable()
    private android.widget.SearchView svSearchSong;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String DATABASE_NAME_PROJECT = "Arirang.sqlite";
    @org.jetbrains.annotations.Nullable()
    private android.widget.ListView lvSongListDatabse;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<elong.models.chapter1_3.Music> sourceListSongDatabase;
    @org.jetbrains.annotations.Nullable()
    private elong.androidApp.adapter.arrayAdapter.chapter1_3.MusicAdapter adapterListSongDatabase;
    @org.jetbrains.annotations.Nullable()
    private android.widget.ListView lvSongLikeDatabse;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<elong.models.chapter1_3.Music> sourceLikeSongDatabase;
    @org.jetbrains.annotations.Nullable()
    private elong.androidApp.adapter.arrayAdapter.chapter1_3.MusicAdapter adapterLikeSongDatabase;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    public final elong.androidApp.databinding.ActivityMainChapter23Binding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.Nullable()
    elong.androidApp.databinding.ActivityMainChapter23Binding p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void addControls() {
    }
    
    private final void addEvents() {
    }
    
    private final void dataBindingChapter2() {
    }
    
    /**
     * PHẦN XỬ LÝ CHUNG CHO CHƯƠNG 2 VÀ 3: CHƯƠNG2-> ACTIVITY,EXPLICIT INTENT & IMPLICIT INTENT và CHƯƠNG3-> ASSETS, SHARED PREFERENCES, QUẢN LÝ DỮ LIỆU VÀ CONTENTPROVIDER
     */
    @java.lang.Override()
    protected void onPause() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    /**
     * CHƯƠNG 2: ACTIVITY, EXPLICIT INTENT and IMPLICIT INTENT
     */
    private final void addControlsChapter2() {
    }
    
    private final void addEventChapter2() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.Button getBtnCheToanBo() {
        return null;
    }
    
    public final void setBtnCheToanBo(@org.jetbrains.annotations.Nullable()
    android.widget.Button p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.Button getBtnCheMotPhan() {
        return null;
    }
    
    public final void setBtnCheMotPhan(@org.jetbrains.annotations.Nullable()
    android.widget.Button p0) {
    }
    
    private final void addControlsChapter2ActivitynLifetime() {
    }
    
    private final void addEventChapter2ActivitynLifetime() {
    }
    
    @java.lang.Override()
    protected void onStart() {
    }
    
    @java.lang.Override()
    protected void onRestart() {
    }
    
    @java.lang.Override()
    protected void onStop() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.EditText getTxtAsendData() {
        return null;
    }
    
    public final void setTxtAsendData(@org.jetbrains.annotations.Nullable()
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.EditText getTxtBsendData() {
        return null;
    }
    
    public final void setTxtBsendData(@org.jetbrains.annotations.Nullable()
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.TextView getTxtKetQuaSendData() {
        return null;
    }
    
    public final void setTxtKetQuaSendData(@org.jetbrains.annotations.Nullable()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.Button getBtnSendData() {
        return null;
    }
    
    public final void setBtnSendData(@org.jetbrains.annotations.Nullable()
    android.widget.Button p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.Button getBtnSendDataAndAnswer() {
        return null;
    }
    
    public final void setBtnSendDataAndAnswer(@org.jetbrains.annotations.Nullable()
    android.widget.Button p0) {
    }
    
    private final void addControlChapter2ExplicitIntent() {
    }
    
    private final void addEventChapter2ExplicitIntent() {
    }
    
    private final void addEventChapter2ExplicitIntentSendDataZuaCacActivity() {
    }
    
    private final void addEventChapter2ExplicitIntentSendDataAndAnswerUSCLN() {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.EditText getTxtPhoneActivity() {
        return null;
    }
    
    public final void setTxtPhoneActivity(@org.jetbrains.annotations.Nullable()
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.EditText getTxtMessengerActivity() {
        return null;
    }
    
    public final void setTxtMessengerActivity(@org.jetbrains.annotations.Nullable()
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.Button getBtnDialActivity() {
        return null;
    }
    
    public final void setBtnDialActivity(@org.jetbrains.annotations.Nullable()
    android.widget.Button p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.Button getBtnCallActivity() {
        return null;
    }
    
    public final void setBtnCallActivity(@org.jetbrains.annotations.Nullable()
    android.widget.Button p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.Button getBtnMessengerActivity() {
        return null;
    }
    
    public final void setBtnMessengerActivity(@org.jetbrains.annotations.Nullable()
    android.widget.Button p0) {
    }
    
    private final void addControlChapter2ImplicitIntent() {
    }
    
    private final void addEventChapter2ImplicitIntent() {
    }
    
    private final void addEventChapter2ImplicitIntentDialActivity() {
    }
    
    private final void addEventChapter2ImplicitIntentCallActivity() {
    }
    
    private final void addEventChapter2ImplicitIntentMessengerActivity() {
    }
    
    /**
     * CHƯƠNG 3: ASSETS, SHARED PREFERENCES, QUẢN LÝ DỮ LIỆU VÀ CONTENTPROVIDER
     */
    private final void addControlsChapter3() {
    }
    
    private final void addEventChapter3() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.TextView getTxtFont() {
        return null;
    }
    
    public final void setTxtFont(@org.jetbrains.annotations.Nullable()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNameSaver() {
        return null;
    }
    
    public final void setNameSaver(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.ListView getLvFont() {
        return null;
    }
    
    public final void setLvFont(@org.jetbrains.annotations.Nullable()
    android.widget.ListView p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> getSourceListFont() {
        return null;
    }
    
    public final void setSourceListFont(@org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.ArrayAdapter<java.lang.String> getAdapterFont() {
        return null;
    }
    
    public final void setAdapterFont(@org.jetbrains.annotations.Nullable()
    android.widget.ArrayAdapter<java.lang.String> p0) {
    }
    
    private final void addControlChapter3AssetsAndSharedPreferencesFont() {
    }
    
    private final void addEventChapter3AssetsAndSharedPreferencesFont() {
    }
    
    private final void addEventChapter3AssetsAndSharedPreferencesFontXuLyChangeFont(int position) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.EditText getTxtUsername() {
        return null;
    }
    
    public final void setTxtUsername(@org.jetbrains.annotations.Nullable()
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.EditText getTxtPassword() {
        return null;
    }
    
    public final void setTxtPassword(@org.jetbrains.annotations.Nullable()
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.CheckBox getChkSaveInforLogin() {
        return null;
    }
    
    public final void setChkSaveInforLogin(@org.jetbrains.annotations.Nullable()
    android.widget.CheckBox p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNameInformationLogin() {
        return null;
    }
    
    public final void setNameInformationLogin(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    private final void addControlChapter3AssetsAndSharedPreferencesLogin() {
    }
    
    private final void addControlChapter3AssetsAndSharedPreferencesLoginSaveStatusInOnPause() {
    }
    
    private final void addControlChapter3AssetsAndSharedPreferencesLoginSaveStatusInOnResume() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.ListView getLvMusic() {
        return null;
    }
    
    public final void setLvMusic(@org.jetbrains.annotations.Nullable()
    android.widget.ListView p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> getSourceListMusic() {
        return null;
    }
    
    public final void setSourceListMusic(@org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.ArrayAdapter<java.lang.String> getAdapterMusic() {
        return null;
    }
    
    public final void setAdapterMusic(@org.jetbrains.annotations.Nullable()
    android.widget.ArrayAdapter<java.lang.String> p0) {
    }
    
    private final void addControlChapter3AssetsAndSharedPreferencesPlayMusic() {
    }
    
    private final void addEventChapter3AssetsAndSharedPreferencesLoginPlayMusic() {
    }
    
    private final void addEventChapter3AssetsAndSharedPreferencesLoginPlayMusicXuLyListenSong(int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDB_PATH_SUFFIX() {
        return null;
    }
    
    public final void setDB_PATH_SUFFIX(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    private final void addControlChapter3SQLiteCopyDatabaseFromAssetsToMobileSystem() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.database.sqlite.SQLiteDatabase getDbDanhBa() {
        return null;
    }
    
    public final void setDbDanhBa(@org.jetbrains.annotations.Nullable()
    android.database.sqlite.SQLiteDatabase p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDATABASE_NAME_CONTACT() {
        return null;
    }
    
    public final void setDATABASE_NAME_CONTACT(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.ListView getLvDanhBaDatabase() {
        return null;
    }
    
    public final void setLvDanhBaDatabase(@org.jetbrains.annotations.Nullable()
    android.widget.ListView p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<elong.models.chapter1_2_3_7.DanhBa> getSourceListDanhBaDatabase() {
        return null;
    }
    
    public final void setSourceListDanhBaDatabase(@org.jetbrains.annotations.Nullable()
    java.util.List<elong.models.chapter1_2_3_7.DanhBa> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final elong.androidApp.adapter.arrayAdapter.chapter1_2_3_7.DanhBaAdapter getAdapterDanhBaDatabase() {
        return null;
    }
    
    public final void setAdapterDanhBaDatabase(@org.jetbrains.annotations.Nullable()
    elong.androidApp.adapter.arrayAdapter.chapter1_2_3_7.DanhBaAdapter p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.Button getBtnAddOrUpdateDanhBa() {
        return null;
    }
    
    public final void setBtnAddOrUpdateDanhBa(@org.jetbrains.annotations.Nullable()
    android.widget.Button p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.Button getBtnDeleteDanhBa() {
        return null;
    }
    
    public final void setBtnDeleteDanhBa(@org.jetbrains.annotations.Nullable()
    android.widget.Button p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.EditText getTxtNameDanhBaDatabase() {
        return null;
    }
    
    public final void setTxtNameDanhBaDatabase(@org.jetbrains.annotations.Nullable()
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.EditText getTxtCodeDanhBaDatabase() {
        return null;
    }
    
    public final void setTxtCodeDanhBaDatabase(@org.jetbrains.annotations.Nullable()
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.EditText getTxtPhoneDanhBaDatabase() {
        return null;
    }
    
    public final void setTxtPhoneDanhBaDatabase(@org.jetbrains.annotations.Nullable()
    android.widget.EditText p0) {
    }
    
    private final void addControlChapter3SQLiteShowDatabaseToGraphicUserInterface() {
    }
    
    private final void addControlChapter3SQLiteShowDatabaseToGraphicUserInterfaceShowAllDanhBa() {
    }
    
    private final void addEventChapter3SQLitePutDatabaseToGraphicUserInterface() {
    }
    
    private final void addEventChapter3SQLitePutDatabaseToGraphicUserInterfaceAddOrUpdateDanhBaDatabase() {
    }
    
    private final void addEventChapter3SQLitePutDatabaseToGraphicUserInterfaceDeleteDanhBaDatabase() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.Button getBtnReadDanhBaOfMine() {
        return null;
    }
    
    public final void setBtnReadDanhBaOfMine(@org.jetbrains.annotations.Nullable()
    android.widget.Button p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.Button getBtnReadMessageOfMine() {
        return null;
    }
    
    public final void setBtnReadMessageOfMine(@org.jetbrains.annotations.Nullable()
    android.widget.Button p0) {
    }
    
    private final void addControlChapter3ContentProviderReadContactAndSMSFromMobile() {
    }
    
    private final void addEventChapter3ContentProviderReadContactAndSMSFromMobile() {
    }
    
    private final void addEventChapter3ContentProviderReadContactFromMobile() {
    }
    
    private final void addEventChapter3ContentProviderReadSMSFromMobile() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.TabHost getTabHostMusicDatabase() {
        return null;
    }
    
    public final void setTabHostMusicDatabase(@org.jetbrains.annotations.Nullable()
    android.widget.TabHost p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.SearchView getSvSearchSong() {
        return null;
    }
    
    public final void setSvSearchSong(@org.jetbrains.annotations.Nullable()
    android.widget.SearchView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDATABASE_NAME_PROJECT() {
        return null;
    }
    
    public final void setDATABASE_NAME_PROJECT(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.ListView getLvSongListDatabse() {
        return null;
    }
    
    public final void setLvSongListDatabse(@org.jetbrains.annotations.Nullable()
    android.widget.ListView p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<elong.models.chapter1_3.Music> getSourceListSongDatabase() {
        return null;
    }
    
    public final void setSourceListSongDatabase(@org.jetbrains.annotations.Nullable()
    java.util.List<elong.models.chapter1_3.Music> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final elong.androidApp.adapter.arrayAdapter.chapter1_3.MusicAdapter getAdapterListSongDatabase() {
        return null;
    }
    
    public final void setAdapterListSongDatabase(@org.jetbrains.annotations.Nullable()
    elong.androidApp.adapter.arrayAdapter.chapter1_3.MusicAdapter p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.ListView getLvSongLikeDatabse() {
        return null;
    }
    
    public final void setLvSongLikeDatabse(@org.jetbrains.annotations.Nullable()
    android.widget.ListView p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<elong.models.chapter1_3.Music> getSourceLikeSongDatabase() {
        return null;
    }
    
    public final void setSourceLikeSongDatabase(@org.jetbrains.annotations.Nullable()
    java.util.List<elong.models.chapter1_3.Music> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final elong.androidApp.adapter.arrayAdapter.chapter1_3.MusicAdapter getAdapterLikeSongDatabase() {
        return null;
    }
    
    public final void setAdapterLikeSongDatabase(@org.jetbrains.annotations.Nullable()
    elong.androidApp.adapter.arrayAdapter.chapter1_3.MusicAdapter p0) {
    }
    
    private final void addControlChapter3SQLiteCopyDatabaseFromAssetsToMobileSystemProjectKaraoke() {
    }
    
    private final void addControlChapter3SQLiteShowDatabaseToGUIProjectKaraoke() {
    }
    
    private final void addEventChapter3SQLiteShowDatabaseToGUIProjectKaraoke() {
    }
    
    private final void addEventChapter3SQLiteShowDatabaseToGUIProjectKaraokeShowAllMusic() {
    }
    
    private final void addEventChapter3SQLiteShowDatabaseToGUIProjectKaraokeShowLikedMusic() {
    }
    
    private final void addEventChapter3SQLiteShowDatabaseToGUIProjectKaraokeSearchListMusic(java.lang.String name) {
    }
    
    private final void addEventChapter3SQLiteShowDatabaseToGUIProjectKaraokeSearchLikedMusic(java.lang.String name) {
    }
    
    public MainActivityChapter2Chapter3() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lelong/androidApp/MainActivityChapter2Chapter3$database;", "", "()V", "dbKaraoke", "Landroid/database/sqlite/SQLiteDatabase;", "getDbKaraoke", "()Landroid/database/sqlite/SQLiteDatabase;", "setDbKaraoke", "(Landroid/database/sqlite/SQLiteDatabase;)V", "androidApp_release"})
    public static final class database {
        @org.jetbrains.annotations.Nullable()
        private static android.database.sqlite.SQLiteDatabase dbKaraoke;
        @org.jetbrains.annotations.NotNull()
        public static final elong.androidApp.MainActivityChapter2Chapter3.database INSTANCE = null;
        
        @org.jetbrains.annotations.Nullable()
        public final android.database.sqlite.SQLiteDatabase getDbKaraoke() {
            return null;
        }
        
        public final void setDbKaraoke(@org.jetbrains.annotations.Nullable()
        android.database.sqlite.SQLiteDatabase p0) {
        }
        
        private database() {
            super();
        }
    }
}