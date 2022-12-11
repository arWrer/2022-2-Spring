package com.shop.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.Builder;

import java.time.LocalDateTime;

import com.shop.entity.Item;

@Getter
@Setter
public class ItemDto {
    private Long id;

    private String itemNm;

    private Integer price;

    private String itemDetail;

    private String sellStatCd;

    private LocalDateTime regTime;

    private LocalDateTime updateTime;
    private static int view;

    @Builder
    public ItemDto(int view) {
        this.view = view;
    }


    public Item toEntity(){
        return Item.builder()
                .view(view)
                .build();
    }


    public static int getCountView() {
        return view;
    }
    public static int countView(int a) {
        return a+1;
    }


    public void updateView(int View){
        this.view=View;
    }

}
