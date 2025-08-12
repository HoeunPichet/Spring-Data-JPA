package com.kshrd.spring_data_jpa.model.dto;

import lombok.*;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PaginationDto {
    private Long totalElements;
    private Long currentPage;
    private Long pageSize;
    private Long totalPages;
}
