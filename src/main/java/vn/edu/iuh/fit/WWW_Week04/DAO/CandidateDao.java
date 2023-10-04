package vn.edu.iuh.fit.WWW_Week04.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Component;
import vn.edu.iuh.fit.WWW_Week04.models.Candidate;

import javax.sql.DataSource;
import java.util.List;

@Component
public class CandidateDao extends AbstractDao<Candidate, Long> {
    @Autowired
    public CandidateDao(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public void insert(Candidate candidate) {
        String sql = "insert into cadidate value(?,?,?,?,?,?)";
        jdbcTemplate.update(sql, candidate.getId(), candidate.getDob(), candidate.getEmail(), candidate.getFullName(), candidate.getPhone(), candidate.getAddress());
    }

    @Override
    public void update(Candidate candidate) {

    }

    @Override
    public boolean delete(Long aLong) {

        return false;
    }


    @Override
    public Candidate getById(Long aLong) {
        return null;
    }

    @Override
    public List<Candidate> getALL() {
        return null;
    }
}
