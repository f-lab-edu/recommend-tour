package com.recommend_tour.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0005H\u00c6\u0003J3\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001d\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u001fH\u00d6\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001e\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010\u00a8\u0006 "}, d2 = {"Lcom/recommend_tour/data/Body;", "", "items", "Lcom/recommend_tour/data/Items;", "numOfRows", "", "pageNo", "totalCount", "(Lcom/recommend_tour/data/Items;III)V", "getItems", "()Lcom/recommend_tour/data/Items;", "setItems", "(Lcom/recommend_tour/data/Items;)V", "getNumOfRows", "()I", "setNumOfRows", "(I)V", "getPageNo", "setPageNo", "getTotalCount", "setTotalCount", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "app_debug"})
public final class Body {
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "items")
    private com.recommend_tour.data.Items items;
    @com.google.gson.annotations.SerializedName(value = "numOfRows")
    private int numOfRows;
    @com.google.gson.annotations.SerializedName(value = "pageNo")
    private int pageNo;
    @com.google.gson.annotations.SerializedName(value = "totalCount")
    private int totalCount;
    
    @org.jetbrains.annotations.NotNull
    public final com.recommend_tour.data.Body copy(@org.jetbrains.annotations.Nullable
    com.recommend_tour.data.Items items, int numOfRows, int pageNo, int totalCount) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public Body(@org.jetbrains.annotations.Nullable
    com.recommend_tour.data.Items items, int numOfRows, int pageNo, int totalCount) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.recommend_tour.data.Items component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.recommend_tour.data.Items getItems() {
        return null;
    }
    
    public final void setItems(@org.jetbrains.annotations.Nullable
    com.recommend_tour.data.Items p0) {
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int getNumOfRows() {
        return 0;
    }
    
    public final void setNumOfRows(int p0) {
    }
    
    public final int component3() {
        return 0;
    }
    
    public final int getPageNo() {
        return 0;
    }
    
    public final void setPageNo(int p0) {
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int getTotalCount() {
        return 0;
    }
    
    public final void setTotalCount(int p0) {
    }
}