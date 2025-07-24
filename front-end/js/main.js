$(document).ready(function () {
    loadJobs();
    $('#saveJobBtn').on('click', function () {

        let job_title = $('#jobTitle').val().trim();
        let company = $('#companyName').val().trim();
        let location = $('#jobLocation').val().trim();
        let type = $('#jobType').val();
        let description = $('#jobDescription').val().trim();


        if (!title || !company || !location) {
            alert('🚨 Please fill out all required fields!');
            return;
        }

        // AJAX POST request
        $.ajax({
            url: 'http://localhost:8080/api/v1/job/create',
            method: 'POST',
            contentType: 'application/json',
            data: JSON.stringify({
                jobTitle: job_title,
                company: company,
                location: location,
                type: type,
                description: description
            }),
            success: function (response) {
                alert('🎉 Job saved successfully!');
                $('#addJobForm')[0].reset();
                loadJobs();
            },
            error: function (xhr, status, error) {
                alert('💥 Failed to save job. Try again.');
            }
        });
    });
});

function loadJobs() {
    $.ajax({
        url: 'http://localhost:8080/api/v1/job/getAll', // Same endpoint
        method: 'GET',
        success: function (jobs) {
            $('#jobsTableBody').empty(); // Clear existing
            jobs.forEach((job, index) => {
                $('#jobsTableBody').append(`
                    <tr>
                        <td>${index + 1}</td>
                        <td>${job.jobTitle}</td>
                        <td>${job.company}</td>
                        <td>${job.location}</td>
                        <td>${job.type}</td>
                        <td>${job.status || 'Open'}</td>
                        <td>
                            <button class="btn btn-sm btn-warning">Edit</button>
                            <button class="btn btn-sm btn-danger">Delete</button>
                        </td>
                    </tr>
                `);
            });
        }
    });
}

let offset = 0;

$("#nextPage").on('click' , () => {
    offset += 10;
    $.ajax({
        url : 'http://localhost:8080/api/v1/job/getAll',
        method : "GET",
        data: {
            offset : offset
        },
        success: function (jobs) {
            $('#jobsTableBody').empty(); // Clear existing
            jobs.forEach((job) => {
                $('#jobsTableBody').append(`
                    <tr>
                        <td>${job.id}</td>
                        <td>${job.jobTitle}</td>
                        <td>${job.company}</td>
                        <td>${job.location}</td>
                        <td>${job.type}</td>
                        <td>${job.status || 'Open'}</td>
                        <td>
                            <button class="btn btn-sm btn-warning">Edit</button>
                            <button class="btn btn-sm btn-danger">Delete</button>
                        </td>
                    </tr>
                `);
            });
        }
    })
});

$("#previousPage").on('click' , () => {
    if (offset >= 10) {
        offset -= 10;
    }else {
        alert("NO ANY PREVIOUS PAGES")
    }
    $.ajax({
        url : 'http://localhost:8080/api/v1/job/getAll',
        method : "GET",
        data: {
            offset : offset
        },
        success: function (jobs) {
            $('#jobsTableBody').empty(); // Clear existing
            jobs.forEach((job) => {
                $('#jobsTableBody').append(`
                    <tr>
                        <td>${job.id}</td>
                        <td>${job.jobTitle}</td>
                        <td>${job.company}</td>
                        <td>${job.location}</td>
                        <td>${job.type}</td>
                        <td>${job.status || 'Open'}</td>
                        <td>
                            <button class="btn btn-sm btn-warning">Edit</button>
                            <button class="btn btn-sm btn-danger">Delete</button>
                        </td>
                    </tr>
                `);
            });
        }
    })
})

